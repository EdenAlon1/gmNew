package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class ffyo {
    public static final ffxx a(ffxx ffxxVar) {
        return ffxz.a(ffxxVar, -1);
    }

    public static final ffxx b(ffxx ffxxVar, ffhd ffhdVar) {
        if (ffhdVar.get(ffud.c) == null) {
            return !ffkj.e(ffhdVar, ffhe.a) ? ffxxVar instanceof fgfd ? fgfc.a((fgfd) ffxxVar, ffhdVar, 0, 0, 6) : new fgei(ffxxVar, ffhdVar, 0, 0, 12) : ffxxVar;
        }
        Objects.toString(ffhdVar);
        throw new IllegalArgumentException("Flow context cannot contain job in it. Had ".concat(String.valueOf(ffhdVar)));
    }
}
