package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxzg implements dwqt {
    private final String a;
    private final String b;

    public dxzg(dxzf dxzfVar) {
        this.a = dxzfVar.a;
        this.b = dxzfVar.b;
    }

    @Override // defpackage.dwqt
    public final ListenableFuture a(final dwub dwubVar) {
        dxth.b("%s: Add groups from ph config to Mdd.", "PhFileGroupPop");
        ecwh ecwhVar = new ecwh(ecvd.a(this.a));
        dwqh dwqhVar = (dwqh) ecwhVar.k(this.b, dwqh.a, new ecwg() { // from class: dxza
            @Override // defpackage.ecwg
            public final Object a(byte[] bArr) {
                return (dwqh) eyfy.parseFrom(dwqh.a, bArr);
            }
        }).b();
        ArrayList arrayList = new ArrayList();
        for (final dwqf dwqfVar : dwqhVar.b) {
            dxth.c("%s: Found ph flag %s from ph config.", "PhFileGroupPop", dwqfVar.b);
            ecwj k = ecwhVar.k(dwqfVar.b, null, new ecwg() { // from class: dxzb
                @Override // defpackage.ecwg
                public final Object a(byte[] bArr) {
                    return (dwpj) eyfy.parseFrom(dwpj.a, bArr);
                }
            });
            ListenableFuture i = erqt.i(emux.a);
            if (k.b() != null && !((dwpj) k.b()).c.isEmpty()) {
                i = erqt.i(emxc.j((dwpj) k.b()));
            }
            ListenableFuture k2 = elfr.k(i, new eroh() { // from class: dxzc
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    emxc emxcVar = (emxc) obj;
                    if (!emxcVar.g() || ((dwpj) emxcVar.c()).c.isEmpty()) {
                        dxth.c("%s: Not adding file group from ph flag %s because of overrider.", "PhFileGroupPop", dwqfVar.b);
                        return erqt.i(false);
                    }
                    dwub dwubVar2 = dwub.this;
                    dwob dwobVar = new dwob();
                    dwobVar.c((dwpj) emxcVar.c());
                    return dwubVar2.a(dwobVar.a());
                }
            }, erpp.a);
            elfr.l(k2, new dxze(k), erpp.a);
            arrayList.add(k2);
        }
        return dycg.a(arrayList).a(new Callable() { // from class: dxzd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, erpp.a);
    }
}
