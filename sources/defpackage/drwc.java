package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.TextAppearanceSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class drwc extends druz {
    public drvg ag;
    public ffji ah;
    public drwd aj;
    public String ak;
    public String al;
    public aepl an;
    public aesp ao;
    private boolean aq;
    public ffix ai = new ffix() { // from class: drvh
        @Override // defpackage.ffix
        public final Object invoke() {
            return ffcu.a;
        }
    };
    public drva am = drva.MEDIA_TYPE_UNKNOWN;

    private final drwg aU() {
        return ba().c().isChecked() ? drwg.a : drwg.b;
    }

    private final CharSequence aZ(ffji ffjiVar) {
        drwh drwhVar = new drwh();
        ffjiVar.invoke(drwhVar);
        CharSequence[] charSequenceArr = new CharSequence[2];
        String valueOf = String.valueOf(drwhVar.a);
        eg fe = fe();
        SpannableString a = drwe.a(valueOf.concat("\n"));
        a.setSpan(new TextAppearanceSpan(fe, R.style.TextAppearance_GoogleMaterial_Subhead1), 0, a.length(), 33);
        charSequenceArr[0] = a;
        CharSequence charSequence = drwhVar.b;
        charSequenceArr[1] = charSequence != null ? drwe.a(charSequence) : null;
        CharSequence concat = TextUtils.concat(charSequenceArr);
        concat.getClass();
        return concat;
    }

    private final void bb() {
        ffqy.d(lks.a(this), null, null, new drvu(this, null), 3);
    }

    @Override // defpackage.efam, defpackage.ea
    public View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        super.M(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.gallery_google_photos_send_type_select_tray, viewGroup, false);
        inflate.getClass();
        return inflate;
    }

    @Override // defpackage.efam, defpackage.ea
    public void ap(View view, Bundle bundle) {
        int i;
        int i2;
        view.getClass();
        super.ap(view, bundle);
        this.ak = B().getString(R.string.gallery_google_photos_option_tray_type_photos_link_learn_more_link);
        this.ag = new drvg(view);
        RadioButton c = ba().c();
        c.setChecked(true);
        c.setLinksClickable(true);
        c.setMovementMethod(LinkMovementMethod.getInstance());
        final String string = c.getResources().getString(R.string.gallery_google_photos_option_tray_type_photos_link_title);
        string.getClass();
        final String string2 = c.getResources().getString(R.string.gallery_google_photos_option_tray_type_photos_link_body);
        string2.getClass();
        final String string3 = c.getResources().getString(R.string.gallery_google_photos_option_tray_type_photos_link_learn_more);
        string3.getClass();
        c.setText(aZ(new ffji() { // from class: drvl
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                drwh drwhVar = (drwh) obj;
                drwhVar.getClass();
                drwhVar.a = string;
                CharSequence b = drwe.b(string2, " ");
                b.getClass();
                String str = this.ak;
                if (str == null) {
                    ffkj.c("learnMoreUrl");
                    str = null;
                }
                String str2 = string3;
                str.getClass();
                SpannableString a = drwe.a(str2);
                a.setSpan(new URLSpan(str), 0, a.length(), 33);
                drwhVar.b = drwe.b(b, a);
                return ffcu.a;
            }
        }));
        RadioButton radioButton = (RadioButton) ba().b.a();
        Resources resources = radioButton.getResources();
        int ordinal = this.am.ordinal();
        if (ordinal == 0) {
            i = R.string.gallery_google_photos_option_tray_type_attachment_title_unknown;
        } else if (ordinal == 1) {
            i = R.string.gallery_google_photos_option_tray_type_attachment_title_video;
        } else {
            if (ordinal != 2) {
                throw new ffcd();
            }
            i = R.string.gallery_google_photos_option_tray_type_attachment_title_image;
        }
        final String string4 = resources.getString(i);
        string4.getClass();
        Resources resources2 = radioButton.getResources();
        int ordinal2 = this.am.ordinal();
        if (ordinal2 == 0) {
            i2 = R.string.gallery_google_photos_option_tray_type_attachment_body_unknown;
        } else if (ordinal2 == 1) {
            i2 = R.string.gallery_google_photos_option_tray_type_attachment_body_video;
        } else {
            if (ordinal2 != 2) {
                throw new ffcd();
            }
            i2 = R.string.gallery_google_photos_option_tray_type_attachment_body_image;
        }
        final String string5 = resources2.getString(i2);
        string5.getClass();
        radioButton.setText(aZ(new ffji() { // from class: drvp
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                drwh drwhVar = (drwh) obj;
                drwhVar.getClass();
                drwhVar.a = string4;
                drwhVar.b = string5;
                return ffcu.a;
            }
        }));
        if (!this.aq) {
            hw();
        } else {
            bb();
            ffqy.d(lks.a(this), null, null, new drvt(this, null), 3);
        }
    }

    public final drvg ba() {
        drvg drvgVar = this.ag;
        if (drvgVar != null) {
            return drvgVar;
        }
        ffkj.c("binding");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        if (defpackage.ffcu.a == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        if (r10.a(r11, r0) == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object bf(defpackage.ffjm r10, defpackage.ffgu r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.drvs
            if (r0 == 0) goto L13
            r0 = r11
            drvs r0 = (defpackage.drvs) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            drvs r0 = new drvs
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            java.lang.String r3 = "accountSignIn"
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L47
            if (r2 == r6) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            goto L35
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            defpackage.ffci.b(r11)
            goto L9c
        L39:
            drwg r10 = r0.f
            java.lang.Object r2 = r0.b
            java.lang.Object r6 = r0.a
            defpackage.ffci.b(r11)
            r8 = r11
            r11 = r10
            r10 = r2
            r2 = r8
            goto L69
        L47:
            defpackage.ffci.b(r11)
            drwg r11 = r9.aU()
            drwg r2 = defpackage.drwg.a
            if (r11 != r2) goto L8d
            aepl r2 = r9.an
            if (r2 != 0) goto L5a
            defpackage.ffkj.c(r3)
            r2 = r7
        L5a:
            r0.a = r9
            r0.b = r10
            r0.f = r11
            r0.e = r6
            java.lang.Object r2 = r2.a(r0)
            if (r2 == r1) goto L9b
            r6 = r9
        L69:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L8d
            drwc r6 = (defpackage.drwc) r6
            aepl r10 = r6.an
            if (r10 != 0) goto L7b
            defpackage.ffkj.c(r3)
            r10 = r7
        L7b:
            r0.a = r7
            r0.b = r7
            r0.f = r7
            r0.e = r5
            adif r10 = r10.a
            r10.a()
            ffcu r10 = defpackage.ffcu.a
            if (r10 != r1) goto L9c
            goto L9b
        L8d:
            r0.a = r7
            r0.b = r7
            r0.f = r7
            r0.e = r4
            java.lang.Object r10 = r10.a(r11, r0)
            if (r10 != r1) goto L9c
        L9b:
            return r1
        L9c:
            ffcu r10 = defpackage.ffcu.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drwc.bf(ffjm, ffgu):java.lang.Object");
    }

    public final void bg(drva drvaVar) {
        drvaVar.getClass();
        this.am = drvaVar;
    }

    public final boolean bh() {
        return aU() == drwg.a;
    }

    public final void bi(final ffrf ffrfVar, drwd drwdVar, aepl aeplVar, String str, String str2) {
        str.getClass();
        this.ah = new drvr(ffrfVar);
        this.ai = new ffix() { // from class: drvm
            @Override // defpackage.ffix
            public final Object invoke() {
                ffrf ffrfVar2 = ffrf.this;
                if (!ffrfVar2.k()) {
                    ffrfVar2.w(null);
                }
                return ffcu.a;
            }
        };
        this.aj = drwdVar;
        this.an = aeplVar;
        this.al = str;
        if (str2 != null) {
            this.ak = str2;
        }
        if (this.ag != null) {
            bb();
        }
        this.aq = true;
    }

    public final aesp bj() {
        aesp aespVar = this.ao;
        if (aespVar != null) {
            return aespVar;
        }
        ffkj.c("logger");
        return null;
    }

    @Override // defpackage.ehbo, defpackage.kc, defpackage.dn
    public final Dialog hf(Bundle bundle) {
        Dialog hf = super.hf(bundle);
        final ehbn ehbnVar = (ehbn) hf;
        ehbnVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: drvi
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ehbn ehbnVar2 = ehbn.this;
                ehbnVar2.a().C(ehbnVar2.a().t());
            }
        });
        return hf;
    }

    @Override // defpackage.dn, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        this.ai.invoke();
    }
}
