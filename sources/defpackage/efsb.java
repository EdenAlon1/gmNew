package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efsb extends LinearLayout {
    public static final /* synthetic */ int b = 0;
    private static final enhk c = enhk.p(0, Integer.valueOf(R.drawable.quantum_ic_sentiment_very_satisfied_grey600_36), 1, Integer.valueOf(R.drawable.quantum_ic_sentiment_satisfied_grey600_36), 2, Integer.valueOf(R.drawable.quantum_ic_sentiment_neutral_grey600_36), 3, Integer.valueOf(R.drawable.quantum_ic_sentiment_dissatisfied_grey600_36), 4, Integer.valueOf(R.drawable.quantum_ic_sentiment_very_dissatisfied_grey600_36));
    public efrz a;

    public efsb(Context context) {
        super(context);
        setOrientation(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(fakn faknVar) {
        int a;
        fagz fagzVar = faknVar.c;
        if (fagzVar == null) {
            fagzVar = fagz.a;
        }
        final View[] viewArr = new View[fagzVar.b.size()];
        fagz fagzVar2 = faknVar.c;
        if (fagzVar2 == null) {
            fagzVar2 = fagz.a;
        }
        final eygr eygrVar = fagzVar2.b;
        int i = faknVar.d;
        int a2 = fakm.a(i);
        final int i2 = 0;
        boolean z = ((a2 != 0 && a2 == 4) || ((a = fakm.a(i)) != 0 && a == 5)) && eygrVar.size() == 5;
        while (i2 < eygrVar.size()) {
            int i3 = i2 + 1;
            int a3 = fagv.a(((fagx) eygrVar.get(i2)).c);
            if (a3 != 0 && a3 == 4) {
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.survey_question_single_select_other_entry, (ViewGroup) this, true);
                final EditText editText = (EditText) linearLayout.findViewById(R.id.survey_other_option);
                efoq.a(editText, (TextView) linearLayout.findViewById(R.id.survey_other_option_personal_info));
                linearLayout.findViewById(R.id.survey_other_option_background).setOnClickListener(new View.OnClickListener() { // from class: efrv
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = efsb.b;
                        EditText editText2 = editText;
                        editText2.requestFocus();
                        efow.i(editText2);
                        view.scrollTo(0, view.getBottom());
                    }
                });
                editText.addTextChangedListener(new efry(this, eygrVar, i2));
                editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: efrw
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z2) {
                        efsb efsbVar = efsb.this;
                        EditText editText2 = editText;
                        if (!z2) {
                            editText2.setHintTextColor(efsbVar.getContext().getColor(R.color.survey_hint_text_unfocused_color));
                            return;
                        }
                        int i4 = i2;
                        List list = eygrVar;
                        editText2.setHintTextColor(efsbVar.getContext().getColor(R.color.survey_hint_text_color));
                        efsbVar.a.a(new efsa(4, "", ((fagx) list.get(i4)).d));
                    }
                });
                viewArr[i2] = editText;
            } else {
                LayoutInflater.from(getContext()).inflate(R.layout.survey_question_single_select_item, (ViewGroup) this, true);
                View childAt = getChildAt(getChildCount() - 1);
                viewArr[i2] = childAt;
                TextView textView = (TextView) childAt.findViewById(R.id.survey_multiple_choice_text);
                textView.setText(((fagx) eygrVar.get(i2)).e);
                textView.setContentDescription(((fagx) eygrVar.get(i2)).e);
                ImageView imageView = (ImageView) viewArr[i2].findViewById(R.id.survey_multiple_choice_icon);
                if (z) {
                    int a4 = fakm.a(faknVar.d);
                    imageView.setImageDrawable(efoo.a(ku.a(getContext(), ((Integer) c.get(Integer.valueOf((a4 != 0 && a4 == 5) ? ((enoz) c).d - i3 : i2))).intValue()), getContext(), getContext().getColor(R.color.survey_grey_icon_color)));
                } else {
                    imageView.setVisibility(8);
                }
                viewArr[i2].setOnClickListener(new View.OnClickListener() { // from class: efru
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = 0;
                        while (true) {
                            View[] viewArr2 = viewArr;
                            if (i4 >= viewArr2.length) {
                                final int i5 = i2;
                                final List list = eygrVar;
                                final efsb efsbVar = efsb.this;
                                view.postOnAnimationDelayed(new Runnable() { // from class: efrx
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        List list2 = list;
                                        int i6 = i5;
                                        efsb.this.a.a(new efsa(3, ((fagx) list2.get(i6)).e, ((fagx) list2.get(i6)).d));
                                        long j = efow.a;
                                    }
                                }, 200L);
                                return;
                            }
                            View view2 = viewArr2[i4];
                            view2.setOnClickListener(null);
                            view2.setClickable(false);
                            i4++;
                        }
                    }
                });
            }
            i2 = i3;
        }
    }
}
