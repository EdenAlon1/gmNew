package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqpz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aqqa b;
    final /* synthetic */ String c;
    final /* synthetic */ ParticipantsTable.BindData d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqpz(aqqa aqqaVar, String str, ParticipantsTable.BindData bindData, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aqqaVar;
        this.c = str;
        this.d = bindData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqpz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a3, code lost:
    
        if (defpackage.ffra.a((defpackage.ffhd) r1, r2, r7) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e3, code lost:
    
        if (r8 == r0) goto L25;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqpz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqpz(this.b, this.c, this.d, ffguVar);
    }
}
