package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efpz extends LinearLayout {
    public efpy a;

    public efpz(Context context) {
        super(context);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.survey_question_open_text_item, (ViewGroup) this, true);
    }

    public final void a(fajc fajcVar) {
        EditText editText = (EditText) findViewById(R.id.survey_open_text);
        efoq.a(editText, (TextView) findViewById(R.id.survey_open_text_personal_info));
        editText.setSingleLine(false);
        if (!fajcVar.b.isEmpty()) {
            editText.setHint(fajcVar.b);
        }
        if (!efow.j(getContext())) {
            editText.requestFocus();
        }
        editText.addTextChangedListener(new efpx(this));
    }
}
