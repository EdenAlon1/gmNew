package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqpb extends ffhv implements ffjm {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ ffjm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqpb(ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqpb) c((engw) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0044 -> B:4:0x0047). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.b
            r2 = 1
            if (r1 == 0) goto L11
            java.lang.Object r1 = r4.a
            java.lang.Object r3 = r4.c
            ffjm r3 = (defpackage.ffjm) r3
            defpackage.ffci.b(r5)
            goto L47
        L11:
            defpackage.ffci.b(r5)
            java.lang.Object r5 = r4.c
            engw r5 = (defpackage.engw) r5
            ffjm r1 = r4.d
            boolean r3 = r5 instanceof java.util.Collection
            if (r3 == 0) goto L25
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L25
            goto L50
        L25:
            java.util.Iterator r5 = r5.iterator()
            r3 = r1
            r1 = r5
        L2b:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L50
            java.lang.Object r5 = r1.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r5 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r5
            r5.getClass()
            r4.c = r3
            r4.a = r1
            r4.b = r2
            java.lang.Object r5 = r3.a(r5, r4)
            if (r5 != r0) goto L47
            return r0
        L47:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L2b
            r2 = 0
        L50:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqpb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aqpb aqpbVar = new aqpb(this.d, ffguVar);
        aqpbVar.c = obj;
        return aqpbVar;
    }
}
