package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbkf implements bbin {
    private static final String a = String.valueOf(bbke.c.d.d()).concat("_expression");
    private static final String b = String.valueOf(bbke.c.f.d()).concat("_expression");
    private static final String c = String.valueOf(bbke.c.a.d()).concat("_expression");

    private static final void c(dtyq dtyqVar, int i) {
        String[] strArr = bbke.a;
        dtvx dtvxVar = new dtvx("conversation_participants_backup", "backup");
        bbjk bbjkVar = bbke.c;
        dtvxVar.b(bbjkVar.b, bbjkVar.c, bbjkVar.e, bbjkVar.d, bbjkVar.f, bbjkVar.a);
        dtvxVar.c = dtyqVar;
        dtvxVar.d = i;
        dtvxVar.a().a();
    }

    @Override // defpackage.bbin
    public final void a() {
        String[] strArr = bbke.a;
        bbjv bbjvVar = new bbjv();
        bbjvVar.f("clearTable");
        bbjvVar.e();
        bbjvVar.b().b();
    }

    @Override // defpackage.bbin
    public final void b(bbim bbimVar) {
        bbimVar.getClass();
        brwp a2 = brww.a();
        brvy brvyVar = brww.c;
        a2.c(brvyVar.b, brvyVar.c, brvyVar.e);
        dtzq dtzqVar = new dtzq("$V", new Object[]{brww.c.d});
        String str = a;
        a2.n(dtzqVar, str);
        dtzq dtzqVar2 = new dtzq("0", new Object[0]);
        String str2 = b;
        a2.n(dtzqVar2, str2);
        dtzq dtzqVar3 = new dtzq("ROW_NUMBER() OVER()", new Object[0]);
        String str3 = c;
        a2.n(dtzqVar3, str3);
        c(a2.b(), 0);
        if (bbimVar.a) {
            String[] strArr = bsdr.a;
            bsdm bsdmVar = new bsdm(bsdr.a);
            bsdmVar.z("conversationToParticipantsTableQuery");
            bscz bsczVar = bsdr.c;
            bsdmVar.c(bsczVar.a, bsczVar.b, bsczVar.c);
            bsdmVar.n(new dtzq("1", new Object[0]), str);
            bsdmVar.n(new dtzq("1", new Object[0]), str2);
            brwp a3 = brww.a();
            a3.z("conversationParticipantsTableCountQuery");
            bsdmVar.n(new dtzq("$V + ROW_NUMBER() OVER()", new Object[]{Integer.valueOf(a3.b().i())}), str3);
            c(bsdmVar.b(), 4);
        }
    }
}
