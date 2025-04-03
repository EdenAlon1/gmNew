package defpackage;

import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cczy extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ cdaf c;
    final /* synthetic */ ccvl d;
    final /* synthetic */ bqvj e;
    final /* synthetic */ Optional f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cczy(cdaf cdafVar, ccvl ccvlVar, bqvj bqvjVar, Optional optional, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = cdafVar;
        this.d = ccvlVar;
        this.e = bqvjVar;
        this.f = optional;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cczy) c((Map) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e8, code lost:
    
        if (r14 != r0) goto L27;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cczy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cczy cczyVar = new cczy(this.c, this.d, this.e, this.f, ffguVar);
        cczyVar.b = obj;
        return cczyVar;
    }
}
