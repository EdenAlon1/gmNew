package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dzqm {
    INVALID(0),
    INCOMING_RECEIVED(1),
    INCOMING_READ(2),
    INCOMING_READ_RECEIPT_SENT(3),
    OUTGOING_PENDING_SEND(4),
    OUTGOING_SENDING(5),
    OUTGOING_FAILED_SEND(6),
    OUTGOING_SENT(7),
    OUTGOING_DELIVERED(8),
    OUTGOING_READ(9),
    OUTGOING_FAILED_TO_DELIVER(10),
    LOCAL(11);

    public static final engw m;
    public static final enip n;
    public static final Integer[] o;
    public final int p;

    static {
        dzqm dzqmVar = OUTGOING_PENDING_SEND;
        dzqm dzqmVar2 = OUTGOING_SENDING;
        dzqm dzqmVar3 = OUTGOING_FAILED_SEND;
        dzqm dzqmVar4 = OUTGOING_SENT;
        dzqm dzqmVar5 = OUTGOING_DELIVERED;
        dzqm dzqmVar6 = OUTGOING_READ;
        dzqm dzqmVar7 = OUTGOING_FAILED_TO_DELIVER;
        dzqm dzqmVar8 = LOCAL;
        m = engw.u(dzqmVar, dzqmVar2, dzqmVar3, dzqmVar4);
        n = enip.v(dzqmVar, dzqmVar2, dzqmVar3, dzqmVar4, dzqmVar5, dzqmVar6, dzqmVar7, dzqmVar8);
        o = new Integer[]{Integer.valueOf(dzqmVar.p), Integer.valueOf(dzqmVar2.p), Integer.valueOf(dzqmVar3.p), Integer.valueOf(dzqmVar8.p)};
    }

    dzqm(int i) {
        this.p = i;
    }

    public static dzqm a(final int i) {
        return (dzqm) enfc.e(values()).a(new emxg() { // from class: dzql
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                dzqm dzqmVar = dzqm.INVALID;
                return ((dzqm) obj).p == i;
            }
        }).e(INVALID);
    }
}
