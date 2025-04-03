package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vxw implements cpff {
    final /* synthetic */ bcqs a;
    final /* synthetic */ bdud b;
    final /* synthetic */ cvfe c;
    final /* synthetic */ ffix d;

    public vxw(bcqs bcqsVar, bdud bdudVar, cvfe cvfeVar, ffix ffixVar) {
        this.a = bcqsVar;
        this.b = bdudVar;
        this.c = cvfeVar;
        this.d = ffixVar;
    }

    @Override // defpackage.cpff
    public final bduq a() {
        return this.b.b;
    }

    @Override // defpackage.cpff
    public final Object b(ffgu ffguVar) {
        return Boolean.valueOf(this.a.n());
    }

    @Override // defpackage.cpff
    public final /* synthetic */ Object c(ffgu ffguVar) {
        return cpfa.a(this, ffguVar);
    }

    @Override // defpackage.cpff
    public final /* synthetic */ Object d(ffgu ffguVar) {
        return cpfa.b(this, ffguVar);
    }

    @Override // defpackage.cpff
    public final Object e(ffgu ffguVar) {
        ParticipantsTable.BindData a = this.a.g.a();
        return Boolean.valueOf(aoqw.j(a != null ? a.U() : null));
    }

    @Override // defpackage.cpff
    public final /* synthetic */ Object f(ffgu ffguVar) {
        return cpfa.c(this, ffguVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cpff
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.vxv
            if (r0 == 0) goto L13
            r0 = r5
            vxv r0 = (defpackage.vxv) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            vxv r0 = new vxv
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r1 = r0.a
            cpfb r0 = r0.e
            defpackage.ffci.b(r5)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            defpackage.ffci.b(r5)
            cvfe r5 = r4.c
            cpfb r2 = defpackage.cpff.e
            r0.e = r2
            r0.a = r5
            r0.d = r3
            java.lang.Object r0 = r4.j()
            if (r0 == r1) goto L54
            r1 = r5
            r5 = r0
            r0 = r2
        L49:
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r5 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r5
            boolean r5 = r0.a(r1, r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vxw.g(ffgu):java.lang.Object");
    }

    @Override // defpackage.cpff
    public final boolean h() {
        return ((Boolean) this.d.invoke()).booleanValue();
    }

    @Override // defpackage.cpff
    public final boolean i() {
        return false;
    }

    @Override // defpackage.cpff
    public final Object j() {
        return this.a.g.a();
    }
}
