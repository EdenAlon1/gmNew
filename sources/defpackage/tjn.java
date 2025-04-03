package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class tjn implements eroh {
    public final /* synthetic */ tlv a;

    @Override // defpackage.eroh
    public final ListenableFuture a(Object obj) {
        final fedn fednVar = (fedn) obj;
        if (!Status.Code.PERMISSION_DENIED.equals(fednVar.a.getCode())) {
            return elfo.d(fednVar);
        }
        final tlv tlvVar = this.a;
        eyfg eyfgVar = (eyfg) eyfh.a.createBuilder();
        eyfgVar.a("box_devices");
        return tlvVar.k((eyfh) eyfgVar.build()).i(new eroh() { // from class: tjx
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                tlv tlvVar2 = tlv.this;
                elfl a = tlvVar2.g.a((esvv) obj2);
                final fedn fednVar2 = fednVar;
                return a.i(new eroh() { // from class: tjt
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj3) {
                        entd entdVar = tlv.a;
                        return elfo.d(fedn.this);
                    }
                }, tlvVar2.h);
            }
        }, tlvVar.h);
    }
}
