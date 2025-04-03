package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvoo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvoq b;
    final /* synthetic */ Uri c;
    final /* synthetic */ MessagePartCoreData d;
    final /* synthetic */ MessageCoreData e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvoo(cvoq cvoqVar, Uri uri, MessagePartCoreData messagePartCoreData, MessageCoreData messageCoreData, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cvoqVar;
        this.c = uri;
        this.d = messagePartCoreData;
        this.e = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvoo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
    
        if (r13.a(r1, r5, r12) == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00e6  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvoo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvoo(this.b, this.c, this.d, this.e, ffguVar);
    }
}
