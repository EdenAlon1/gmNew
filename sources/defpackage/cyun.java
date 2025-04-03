package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyun extends ffhv implements ffjp {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ cyuo e;
    final /* synthetic */ cyuk f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyun(cyuo cyuoVar, cyuk cyukVar, ffgu ffguVar) {
        super(5, ffguVar);
        this.e = cyuoVar;
        this.f = cyukVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        Object obj5 = this.d;
        fffs fffsVar = new fffs((byte[]) null);
        fffsVar.add(obj3);
        if (obj2 != null) {
            fffsVar.add(obj2);
        }
        if (obj4 != null) {
            fffsVar.add(obj4);
        }
        if (obj5 != null) {
            fffsVar.add(obj5);
        }
        engw a = engq.a(ffdx.a(fffsVar));
        final cyuo cyuoVar = this.e;
        final cyuk cyukVar = this.f;
        return new cyup(a, new ffji() { // from class: cyum
            /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
            
                if (defpackage.ffkj.e(r9, r1.a.getString(com.google.android.apps.messaging.R.string.action_people_and_options)) != false) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
            
                if (defpackage.ffkj.e(r9, r1.a.getString(com.google.android.apps.messaging.R.string.action_people_and_options)) != false) goto L24;
             */
            @Override // defpackage.ffji
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r9) {
                /*
                    r8 = this;
                    cyuk r0 = r2
                    int r0 = r0.a
                    cyuo r1 = defpackage.cyuo.this
                    java.lang.String r9 = (java.lang.String) r9
                    r2 = 1
                    r3 = 2132082798(0x7f15006e, float:1.980572E38)
                    r4 = 2132082799(0x7f15006f, float:1.9805722E38)
                    r5 = 2132087362(0x7f151242, float:1.9814977E38)
                    r6 = 2132083239(0x7f150227, float:1.9806615E38)
                    r7 = 3
                    if (r0 != r7) goto L4f
                    android.content.Context r0 = r1.a
                    java.lang.String r0 = r0.getString(r6)
                    boolean r0 = defpackage.ffkj.e(r9, r0)
                    if (r0 == 0) goto L26
                    r2 = 5
                    goto L87
                L26:
                    android.content.Context r0 = r1.a
                    java.lang.String r0 = r0.getString(r5)
                    boolean r0 = defpackage.ffkj.e(r9, r0)
                    if (r0 == 0) goto L34
                    r2 = 6
                    goto L87
                L34:
                    android.content.Context r0 = r1.a
                    java.lang.String r0 = r0.getString(r4)
                    boolean r0 = defpackage.ffkj.e(r9, r0)
                    r4 = 7
                    if (r0 == 0) goto L42
                    goto L78
                L42:
                    android.content.Context r0 = r1.a
                    java.lang.String r0 = r0.getString(r3)
                    boolean r9 = defpackage.ffkj.e(r9, r0)
                    if (r9 == 0) goto L87
                    goto L78
                L4f:
                    android.content.Context r0 = r1.a
                    java.lang.String r0 = r0.getString(r6)
                    boolean r0 = defpackage.ffkj.e(r9, r0)
                    if (r0 == 0) goto L5d
                    r2 = 2
                    goto L87
                L5d:
                    android.content.Context r0 = r1.a
                    java.lang.String r0 = r0.getString(r5)
                    boolean r0 = defpackage.ffkj.e(r9, r0)
                    if (r0 == 0) goto L6b
                    r2 = r7
                    goto L87
                L6b:
                    android.content.Context r0 = r1.a
                    java.lang.String r0 = r0.getString(r4)
                    boolean r0 = defpackage.ffkj.e(r9, r0)
                    r4 = 4
                    if (r0 == 0) goto L7a
                L78:
                    r2 = r4
                    goto L87
                L7a:
                    android.content.Context r0 = r1.a
                    java.lang.String r0 = r0.getString(r3)
                    boolean r9 = defpackage.ffkj.e(r9, r0)
                    if (r9 == 0) goto L87
                    goto L78
                L87:
                    ffbr r9 = r1.b
                    java.lang.Object r9 = r9.b()
                    akzt r9 = (defpackage.akzt) r9
                    int r2 = r2 + (-1)
                    java.lang.String r0 = "Bugle.MiniConversationDetailsPage.Action.Count"
                    r9.e(r0, r2)
                    ffcu r9 = defpackage.ffcu.a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cyum.invoke(java.lang.Object):java.lang.Object");
            }
        });
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        cyun cyunVar = new cyun(this.e, this.f, (ffgu) obj5);
        cyunVar.a = (dlsr) obj;
        cyunVar.b = (dlsr) obj2;
        cyunVar.c = (dlsr) obj3;
        cyunVar.d = (dlsr) obj4;
        return cyunVar.b(ffcu.a);
    }
}
