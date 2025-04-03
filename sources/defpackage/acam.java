package defpackage;

import android.text.Spanned;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acam {
    public static final enhk a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public bcse f = null;
    public Spanned g = null;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k(SuperSortLabel.PERSONAL, ezfy.PERSONAL);
        enhdVar.k(SuperSortLabel.TRANSACTION, ezfy.TRANSACTION);
        enhdVar.k(SuperSortLabel.PROMOTION, ezfy.PROMOTION);
        enhdVar.k(SuperSortLabel.UPDATE, ezfy.UPDATE);
        enhdVar.k(SuperSortLabel.OTP, ezfy.OTP);
        a = enhdVar.c();
    }

    public acam(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
    }
}
