package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpq extends bek {
    public final bpf a;

    public bpq(bcm bcmVar, bpf bpfVar) {
        super(bcmVar);
        this.a = bpfVar;
    }

    @Override // defpackage.bek, defpackage.bcm
    public final ListenableFuture m(final List list, int i, int i2) {
        ksw.b(list.size() == 1, "Only support one capture config.");
        final ListenableFuture K = K(i);
        return bkj.a(Collections.singletonList(bkj.g(bkj.g(bkj.g(bjv.a(K), new bjq() { // from class: bpn
            @Override // defpackage.bjq
            public final ListenableFuture a(Object obj) {
                return ((ayp) ListenableFuture.this.get()).b();
            }
        }, bjb.a()), new bjq() { // from class: bpo
            @Override // defpackage.bjq
            public final ListenableFuture a(Object obj) {
                List list2 = list;
                Integer num = (Integer) ((bdk) list2.get(0)).e.m(bdk.b, 100);
                num.getClass();
                int intValue = num.intValue();
                Integer num2 = (Integer) ((bdk) list2.get(0)).e.m(bdk.a, 0);
                num2.getClass();
                int intValue2 = num2.intValue();
                boc bocVar = bpq.this.a.a.b;
                return bocVar != null ? bocVar.a.c(intValue, intValue2) : new bkk(new Exception("Failed to take picture: pipeline is not ready."));
            }
        }, bjb.a()), new bjq() { // from class: bpp
            @Override // defpackage.bjq
            public final ListenableFuture a(Object obj) {
                return ((ayp) ListenableFuture.this.get()).a();
            }
        }, bjb.a())));
    }
}
