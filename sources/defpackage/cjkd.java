package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjkd {
    public final akzt a;
    public final aujm b;

    public cjkd(akzt akztVar, aujm aujmVar) {
        akztVar.getClass();
        this.a = akztVar;
        this.b = aujmVar;
    }

    public static final String a(cjkh cjkhVar) {
        int ordinal = cjkhVar.ordinal();
        if (ordinal == 0) {
            throw new IllegalArgumentException();
        }
        if (ordinal == 1) {
            return "Bugle.Pipeline.Sms.Receive.Event";
        }
        if (ordinal == 2) {
            return "Bugle.Pipeline.Rcs.Send.Event";
        }
        if (ordinal == 3) {
            return "Bugle.Pipeline.Rcs.Send.Report.Event";
        }
        if (ordinal == 4) {
            return "Bugle.Pipeline.Rcs.Receive.Event";
        }
        throw new ffcd();
    }

    public final void b(cjkh cjkhVar, int i) {
        int ordinal;
        if (this.b.a()) {
            akzt akztVar = this.a;
            String str = "Bugle.Pipeline.Generic.Error";
            if (cjkhVar != null && (ordinal = cjkhVar.ordinal()) != 0) {
                if (ordinal == 1) {
                    str = "Bugle.Pipeline.Sms.Receive.Error";
                } else if (ordinal == 2) {
                    str = "Bugle.Pipeline.Rcs.Send.Error";
                } else if (ordinal == 3) {
                    str = "Bugle.Pipeline.Rcs.Send.Report.Error";
                } else {
                    if (ordinal != 4) {
                        throw new ffcd();
                    }
                    str = "Bugle.Pipeline.Rcs.Receive.Error";
                }
            }
            akztVar.e(str, i);
        }
    }
}
