package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cahm {
    public static final cskc a = cskc.g("BugleEtouffee", "EncryptedMessageRetryHandler");
    public final errl b;
    public final errl c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final awor k;

    public cahm(errl errlVar, errl errlVar2, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, awor aworVar) {
        this.b = errlVar;
        this.c = errlVar2;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.h = ffbrVar5;
        this.i = ffbrVar6;
        this.j = ffbrVar7;
        this.k = aworVar;
    }

    public static Optional b(fayv fayvVar) {
        return clbh.a(fayvVar, clbg.ETOUFFEE_NAMESPACE, "recipient");
    }

    public final Optional a(fayv fayvVar) {
        return clbh.a(fayvVar, clbg.ETOUFFEE_NAMESPACE, "original-message-id").map(new cahg());
    }

    public final boolean c(MessageCoreData messageCoreData) {
        String ap = messageCoreData.ap();
        fayv aa = messageCoreData.aa();
        if (bzwf.e()) {
            if (aa == null || !b(aa).isPresent()) {
                return false;
            }
        } else if (aa == null || !a(aa).isPresent()) {
            return false;
        }
        return messageCoreData.cX() && messageCoreData.cB() && messageCoreData.cF() && !TextUtils.isEmpty(ap);
    }
}
