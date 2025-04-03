package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.os.Trace;
import android.support.v7.widget.AppCompatTextView;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dusd extends dute implements duof {
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyAdapter");
    private static int t = 0;
    public final Runnable d;
    public final boolean e;
    public int f;
    private final emyl u;
    private final emyl v;
    private final Runnable w;
    private final View.OnClickListener x;

    public dusd(Context context, dutt duttVar, engw engwVar, duvr duvrVar, duqj duqjVar, duqh duqhVar, emyl emylVar, emyl emylVar2, Runnable runnable, Runnable runnable2, View.OnClickListener onClickListener) {
        super(context, duttVar, engwVar, duvrVar, duqjVar, duqhVar);
        SystemClock.elapsedRealtime();
        this.f = -1;
        enrr enrrVar = (enrr) ((enrr) a.h()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyAdapter", "<init>", 87, "EmojiPickerBodyAdapter.java");
        int i = t + 1;
        t = i;
        enrrVar.r("EmojiPickerBodyAdapter created (instance count = %s)", i);
        this.e = false;
        this.u = emylVar;
        this.v = emylVar2;
        this.w = runnable;
        this.d = runnable2;
        this.x = onClickListener;
    }

    @Override // defpackage.dute, defpackage.vk
    public final wr e(ViewGroup viewGroup, int i) {
        wr e;
        wr duscVar;
        ozg.a("EmojiPickerBodyAdapter.onCreateViewHolder");
        try {
            if (i == duuk.a) {
                View inflate = this.r.inflate(R.layout.loading_placeholder_view, viewGroup, false);
                inflate.setLayoutParams(new ViewGroup.LayoutParams(L(viewGroup) / this.i, this.j < 0.0f ? this.k : (int) (viewGroup.getMeasuredHeight() / this.j)));
                e = new dusa(inflate);
            } else {
                if (i == duuj.a) {
                    duscVar = new dusb(this.r.inflate(R.layout.loading_category_view_holder, viewGroup, false));
                } else if (i == duty.a) {
                    duscVar = new dusc(this.r.inflate(R.layout.error_category_view_holder, viewGroup, false));
                } else if (i == duuc.a) {
                    e = new duud(viewGroup, L(viewGroup) / this.i, this.j < 0.0f ? this.k : (int) (viewGroup.getMeasuredHeight() / this.j), this.x, this.p);
                } else {
                    e = super.e(viewGroup, i);
                }
                e = duscVar;
            }
            return e;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.dute, defpackage.vk
    public final void g(wr wrVar, int i) {
        int i2 = wrVar.f;
        View view = wrVar.a;
        if (i2 != durh.a) {
            if (i2 == duuc.a) {
                duuc duucVar = (duuc) this.q.get(i);
                G(m(i));
                duvt duvtVar = duucVar.b;
                throw null;
            }
            if (i2 == duuj.a) {
                this.w.run();
                return;
            }
            if (i2 != duty.a) {
                if (i2 == dutv.a) {
                    K(this.f, this.i, view);
                }
                super.g(wrVar, i);
                return;
            } else {
                duty dutyVar = (duty) this.q.get(i);
                TextView textView = (TextView) view.findViewById(R.id.error_category_text);
                CharSequence charSequence = dutyVar.b;
                textView.setText((CharSequence) null);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
        }
        int a2 = this.q.a(i);
        String str = ((durh) this.q.get(i)).b;
        if (str.isEmpty()) {
            str = (String) this.h.get(a2);
        }
        if (!str.isEmpty()) {
            duma.e(view, str);
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.category_name);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(R.id.switch_recent_category_prompt_text);
        if (a2 != 0) {
            if (str.isEmpty()) {
                appCompatTextView.setVisibility(8);
            } else {
                appCompatTextView.setText(str);
                appCompatTextView.setVisibility(0);
            }
            appCompatTextView2.setVisibility(8);
            appCompatTextView2.setText((CharSequence) null);
            appCompatTextView2.setOnClickListener(null);
            return;
        }
        ?? r7 = this.u.get();
        if (r7 == 0) {
            Context context = this.s;
            enru enruVar = duoo.a;
            appCompatTextView.setText(context.getString(R.string.emoji_category_recent));
        } else {
            appCompatTextView.setText((CharSequence) r7);
        }
        appCompatTextView.setVisibility(0);
        Object obj = this.v.get();
        if (obj == null) {
            appCompatTextView2.setVisibility(8);
            appCompatTextView2.setText((CharSequence) null);
            appCompatTextView2.setOnClickListener(null);
        } else {
            ((enrr) ((enrr) a.g()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyAdapter", "onBindViewHolder", 181, "EmojiPickerBodyAdapter.java")).q("emoji: next category");
            appCompatTextView2.setText(this.s.getString(R.string.recent_category_switch_prompt_text, obj));
            appCompatTextView2.setVisibility(0);
            appCompatTextView2.setOnClickListener(new View.OnClickListener() { // from class: durz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    dusd.this.d.run();
                }
            });
        }
    }
}
