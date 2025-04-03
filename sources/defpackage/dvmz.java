package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvmz implements efki {
    @Override // defpackage.efki
    public final void a(efks efksVar) {
        efko efkoVar = new efko();
        efkoVar.b("INSERT INTO chime_versioned_identifiers");
        efkoVar.b("(");
        efkoVar.b("account");
        efkoVar.b(",key");
        efkoVar.b(",value");
        efkoVar.b(")");
        efkoVar.b("SELECT ");
        efkoVar.b("promotions.account");
        efkoVar.b(", ");
        efkoVar.b("chime_versioned_identifiers.key");
        efkoVar.b(", ");
        efkoVar.b("chime_versioned_identifiers.value");
        efkoVar.b(" FROM ");
        efkoVar.b("chime_versioned_identifiers, promotions");
        efkoVar.b(" WHERE ");
        efkoVar.b("promotions.key");
        efkoVar.b(" = ");
        efkoVar.b("chime_versioned_identifiers.key");
        efksVar.g(efkoVar.a());
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        sb.append("account = ?");
        arrayList.add("noaccount");
        efksVar.a(efkm.a("chime_versioned_identifiers", sb, arrayList));
        efko efkoVar2 = new efko();
        efkoVar2.b("INSERT INTO versioned_identifiers");
        efkoVar2.b("(");
        efkoVar2.b("account");
        efkoVar2.b(",key");
        efkoVar2.b(",value");
        efkoVar2.b(")");
        efkoVar2.b("SELECT ");
        efkoVar2.b("promotions.account");
        efkoVar2.b(", ");
        efkoVar2.b("versioned_identifiers.key");
        efkoVar2.b(", ");
        efkoVar2.b("versioned_identifiers.value");
        efkoVar2.b(" FROM ");
        efkoVar2.b("versioned_identifiers, promotions");
        efkoVar2.b(" WHERE ");
        efkoVar2.b("promotions.key");
        efkoVar2.b(" = ");
        efkoVar2.b("versioned_identifiers.key");
        efksVar.g(efkoVar2.a());
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        sb2.append("account = ?");
        arrayList2.add("noaccount");
        efksVar.a(efkm.a("versioned_identifiers", sb2, arrayList2));
    }
}
