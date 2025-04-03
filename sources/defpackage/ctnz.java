package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctnz extends ffhv implements ffjm {
    final /* synthetic */ ctof a;
    final /* synthetic */ fbtu b;
    final /* synthetic */ boolean c;
    final /* synthetic */ emmp d;
    final /* synthetic */ MessageCoreData e;
    final /* synthetic */ ctin f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctnz(ffgu ffguVar, ctof ctofVar, fbtu fbtuVar, boolean z, emmp emmpVar, MessageCoreData messageCoreData, ctin ctinVar) {
        super(2, ffguVar);
        this.a = ctofVar;
        this.b = fbtuVar;
        this.c = z;
        this.d = emmpVar;
        this.e = messageCoreData;
        this.f = ctinVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctnz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:257:0x05ab, code lost:
    
        if (new defpackage.eygk(r4.h, defpackage.fbwy.a).contains(defpackage.fbrm.SUGGESTION_TAG_BIRTHDAY) != false) goto L233;
     */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0376  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 2076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctnz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ctnz ctnzVar = new ctnz(ffguVar, this.a, this.b, this.c, this.d, this.e, this.f);
        ctnzVar.g = obj;
        return ctnzVar;
    }
}
