package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
@ffbs
/* loaded from: classes7.dex */
public final class caow implements cbuv {
    public final Context a;
    public final ffbr b;
    private final ffbz c;
    private final ffbz d;

    public caow(Context context, ffbr ffbrVar, asnt asntVar) {
        context.getClass();
        ffbrVar.getClass();
        asntVar.getClass();
        this.a = context;
        this.b = ffbrVar;
        this.c = ffca.a(new ffix() { // from class: caos
            @Override // defpackage.ffix
            public final Object invoke() {
                String string = caow.this.a.getString(R.string.tombstone_details_text);
                string.getClass();
                return string;
            }
        });
        this.d = ffca.a(new ffix() { // from class: caot
            @Override // defpackage.ffix
            public final Object invoke() {
                return crmi.a(caow.this.a);
            }
        });
    }

    private final SpannableStringBuilder e(bcse bcseVar, TextView textView, int i) {
        int f = bcseVar.f();
        if (f != 213) {
            if (f != 226 && f != 229) {
                switch (f) {
                    case 233:
                        break;
                    case 234:
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        if (!bzwf.g()) {
                            spannableStringBuilder.append((CharSequence) cbvv.a(this.a));
                            return spannableStringBuilder;
                        }
                        spannableStringBuilder.append((CharSequence) this.a.getString(R.string.this_rcs_chat_is_no_longer_encrypted_with_details_link, f()));
                        i(spannableStringBuilder, textView);
                        return spannableStringBuilder;
                    case 235:
                    case 237:
                        break;
                    case 236:
                    case 238:
                        if (!bzwd.c()) {
                            return new SpannableStringBuilder(cbvv.a(this.a));
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        spannableStringBuilder2.append((CharSequence) this.a.getString(R.string.this_rcs_chat_is_no_longer_encrypted_with_details_link, f()));
                        i(spannableStringBuilder2, textView);
                        return spannableStringBuilder2;
                    default:
                        throw new IllegalStateException("Unsupported status: " + bcseVar.f());
                }
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("  ");
            h(spannableStringBuilder3, ffpc.Q(spannableStringBuilder3, " ", 0, false, 6), i);
            spannableStringBuilder3.append((CharSequence) this.a.getString(R.string.this_rcs_chat_is_encrypted_with_learn_more_link, g()));
            j(spannableStringBuilder3, textView);
            return spannableStringBuilder3;
        }
        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder("  ");
        h(spannableStringBuilder4, ffpc.Q(spannableStringBuilder4, " ", 0, false, 6), i);
        String str = (String) bzwd.t.e();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        if (str == null) {
            spannableStringBuilder4.append((CharSequence) cbvv.b(this.a));
            return spannableStringBuilder4;
        }
        spannableStringBuilder4.append((CharSequence) this.a.getString(R.string.this_rcs_chat_is_encrypted_with_learn_more_link, g()));
        j(spannableStringBuilder4, textView);
        return spannableStringBuilder4;
    }

    private final String f() {
        return (String) this.c.a();
    }

    private final String g() {
        Object a = this.d.a();
        a.getClass();
        return (String) a;
    }

    private final void h(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        Drawable drawable = this.a.getDrawable(R.drawable.ic_lock_outline_black_12dp);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.setTint(i2);
            spannableStringBuilder.setSpan(new ImageSpan(drawable, 1), i, i + 1, 34);
        }
    }

    private final void i(SpannableStringBuilder spannableStringBuilder, final TextView textView) {
        crmi.d(textView.getContext(), spannableStringBuilder, f(), new View.OnClickListener() { // from class: caou
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ellj.g(new caqj(), textView);
            }
        });
    }

    private final void j(SpannableStringBuilder spannableStringBuilder, final TextView textView) {
        crmi.d(textView.getContext(), spannableStringBuilder, g(), new View.OnClickListener() { // from class: caov
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ellj.g(new caql(), textView);
                ((akzt) this.b.b()).c("Bugle.Etouffee.Education.Alert.Dialog.Count");
            }
        });
    }

    @Override // defpackage.cbuv
    public final String a(bcse bcseVar) {
        bcseVar.getClass();
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.cbuv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.View r2, android.widget.TextView r3, defpackage.bcse r4, int r5) {
        /*
            r1 = this;
            r3.getClass()
            r4.getClass()
            boolean r2 = r1.c(r4)
            if (r2 != 0) goto Ld
            goto L4f
        Ld:
            int r2 = r4.f()
            r0 = 213(0xd5, float:2.98E-43)
            if (r2 == r0) goto L2c
            r0 = 226(0xe2, float:3.17E-43)
            if (r2 == r0) goto L2c
            r0 = 229(0xe5, float:3.21E-43)
            if (r2 == r0) goto L2c
            switch(r2) {
                case 233: goto L22;
                case 234: goto L22;
                case 235: goto L2c;
                case 236: goto L2c;
                case 237: goto L22;
                case 238: goto L22;
                default: goto L20;
            }
        L20:
            r2 = 0
            goto L44
        L22:
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            android.text.SpannableStringBuilder r4 = r1.e(r4, r3, r5)
            r2.<init>(r4)
            goto L44
        L2c:
            android.content.Context r2 = r1.a
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            java.lang.String r2 = r4.V(r2)
            r0.<init>(r2)
            java.lang.String r2 = "\n"
            r0.append(r2)
            android.text.SpannableStringBuilder r2 = r1.e(r4, r3, r5)
            r0.append(r2)
            r2 = r0
        L44:
            if (r2 == 0) goto L4f
            r3.setText(r2)
            defpackage.kvo.l(r3)
            defpackage.egyl.b(r3)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caow.b(android.view.View, android.widget.TextView, bcse, int):void");
    }

    @Override // defpackage.cbuv
    public final boolean c(bcse bcseVar) {
        bcseVar.getClass();
        int f = bcseVar.f();
        if (f == 213) {
            return bzwd.b();
        }
        if (f == 226 || f == 229) {
            return true;
        }
        switch (f) {
            case 233:
            case 234:
            case 235:
            case 236:
            case 237:
            case 238:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.cbuv
    public final boolean d(boolean z) {
        return false;
    }
}
