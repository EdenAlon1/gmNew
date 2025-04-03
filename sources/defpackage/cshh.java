package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cshh extends csgy {
    public final String a;

    public cshh(int i, String str) {
        super(i, csgx.NO_RETRY, String.format("Part id %s failed to be backed up due to insufficient SQS storage!", str));
        this.a = str;
    }
}
