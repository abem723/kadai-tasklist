package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Task;

// フォームへ入力された情報のバリデーションチェックを行うクラス
public class TaskValidator {

    // バリデーションの実行メソッド
    public static List<String> validate(Task t) {
        List<String> errors = new ArrayList<String>();

        String content_error = _validateContent(t.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        return errors;
    }

    // メッセージの必須入力チェックメソッド
    private static String _validateContent(String content) {
        if(content == null || content.equals("")) {
            return "メッセージを入力してください。";
        }

        return "";
    }
}