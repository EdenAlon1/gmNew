package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwbr {
    public static dvxb a(long j) {
        eyfw eyfwVar = dwbs.a;
        dwak dwakVar = (dwak) dwal.a.createBuilder();
        dwakVar.copyOnWrite();
        dwal dwalVar = (dwal) dwakVar.instance;
        dwalVar.b |= 1;
        dwalVar.c = j;
        return new dvxb(eyfwVar, (dwal) dwakVar.build());
    }
}
