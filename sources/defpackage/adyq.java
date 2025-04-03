package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.ProblematicMessageDataView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adyq {
    public final TextView a;
    public final TextView b;
    public final CheckBox c;
    public final ffbr d;
    public adyp e;
    public adux f;

    public adyq(ProblematicMessageDataView problematicMessageDataView, ffbr ffbrVar) {
        this.d = ffbrVar;
        this.a = (TextView) problematicMessageDataView.findViewById(R.id.message_content);
        this.b = (TextView) problematicMessageDataView.findViewById(R.id.message_timestamp);
        CheckBox checkBox = (CheckBox) problematicMessageDataView.findViewById(R.id.advanced_feedback_data_checkbox);
        this.c = checkBox;
        problematicMessageDataView.setOnClickListener(new View.OnClickListener() { // from class: adyn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                adyq adyqVar = adyq.this;
                adyqVar.c.toggle();
                adyp adypVar = adyqVar.e;
                if (adypVar != null) {
                    ((adyj) adypVar).a();
                }
            }
        });
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: adyo
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                adyp adypVar = adyq.this.e;
                if (adypVar != null) {
                    ((adyj) adypVar).a();
                }
            }
        });
    }

    public final boolean a() {
        return this.c.isChecked();
    }
}
