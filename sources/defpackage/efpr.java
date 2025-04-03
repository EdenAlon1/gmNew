package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efpr extends LinearLayout {
    public boolean[] a;
    public String b;
    public efpq c;

    public efpr(Context context) {
        super(context);
        setOrientation(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(faja fajaVar, boolean[] zArr) {
        if (zArr == null) {
            fagz fagzVar = fajaVar.c;
            if (fagzVar == null) {
                fagzVar = fagz.a;
            }
            this.a = new boolean[fagzVar.b.size()];
        } else {
            this.a = zArr;
        }
        fagz fagzVar2 = fajaVar.c;
        if (fagzVar2 == null) {
            fagzVar2 = fagz.a;
        }
        eygr eygrVar = fagzVar2.b;
        for (final int i = 0; i < eygrVar.size(); i++) {
            int a = fagv.a(((fagx) eygrVar.get(i)).c);
            if (a != 0 && a == 4) {
                LayoutInflater.from(getContext()).inflate(R.layout.survey_question_multiple_select_other_option, (ViewGroup) this, true);
                LinearLayout linearLayout = (LinearLayout) getChildAt(i);
                final CheckBox checkBox = (CheckBox) linearLayout.findViewById(R.id.survey_multiple_select_checkbox);
                checkBox.setContentDescription(getResources().getString(R.string.survey_other_option_hint));
                checkBox.setChecked(this.a[i]);
                checkBox.setOnCheckedChangeListener(new efpo(this, i));
                checkBox.setTag("OtherPleaseSpecify");
                final EditText editText = (EditText) linearLayout.findViewById(R.id.survey_other_option);
                efoq.a(editText, (TextView) linearLayout.findViewById(R.id.tv_survey_other_option_pii_info));
                final View findViewById = linearLayout.findViewById(R.id.survey_other_option_background);
                findViewById.setOnTouchListener(new View.OnTouchListener() { // from class: efpl
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() != 1) {
                            return false;
                        }
                        if (motionEvent.getX() >= 0.0f) {
                            CheckBox checkBox2 = checkBox;
                            if (motionEvent.getX() < checkBox2.getWidth() && motionEvent.getY() >= 0.0f) {
                                if (motionEvent.getY() < findViewById.getHeight()) {
                                    checkBox2.performClick();
                                    return false;
                                }
                            }
                        }
                        EditText editText2 = editText;
                        editText2.requestFocus();
                        efow.i(editText2);
                        return false;
                    }
                });
                editText.addTextChangedListener(new efpn(this, i, checkBox));
                editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: efpm
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z) {
                        efpr efprVar = efpr.this;
                        EditText editText2 = editText;
                        if (!z) {
                            editText2.setHintTextColor(efprVar.getContext().getColor(R.color.survey_hint_text_unfocused_color));
                            return;
                        }
                        CheckBox checkBox2 = checkBox;
                        efprVar.a[i] = true;
                        checkBox2.setChecked(true);
                        editText2.setHintTextColor(efprVar.getContext().getColor(R.color.survey_hint_text_color));
                        efprVar.c.a(new efpp(efprVar.b, efprVar.a));
                    }
                });
                efpb efpbVar = efor.c;
                if (fdvd.a.get().a(getContext())) {
                    editText.setFocusable(false);
                    editText.postDelayed(new Runnable() { // from class: efpk
                        @Override // java.lang.Runnable
                        public final void run() {
                            EditText editText2 = editText;
                            editText2.setFocusable(true);
                            editText2.setFocusableInTouchMode(true);
                        }
                    }, 500L);
                }
            } else {
                boolean z = this.a[i];
                int a2 = fagv.a(((fagx) eygrVar.get(i)).c);
                if (a2 == 0) {
                    a2 = 1;
                }
                String str = a2 == 5 ? "NoneOfTheAbove" : null;
                String str2 = ((fagx) eygrVar.get(i)).e;
                LayoutInflater.from(getContext()).inflate(R.layout.survey_question_multiple_select_item, (ViewGroup) this, true);
                FrameLayout frameLayout = (FrameLayout) getChildAt(i);
                final CheckBox checkBox2 = (CheckBox) frameLayout.findViewById(R.id.survey_multiple_select_checkbox);
                checkBox2.setText(str2);
                checkBox2.setContentDescription(str2);
                checkBox2.setChecked(z);
                checkBox2.setOnCheckedChangeListener(new efpo(this, i));
                frameLayout.setOnClickListener(new View.OnClickListener() { // from class: efpj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        checkBox2.performClick();
                    }
                });
                if (str != null) {
                    checkBox2.setTag(str);
                }
            }
        }
    }
}
