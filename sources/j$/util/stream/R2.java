package j$.util.stream;

import j$.util.Collection;
import j$.util.List;
import java.util.ArrayList;

/* loaded from: classes9.dex */
final class R2 extends J2 {
    private ArrayList d;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.d.add(obj);
    }

    @Override // j$.util.stream.AbstractC0138q2, j$.util.stream.InterfaceC0157u2
    public final void j() {
        List.EL.sort(this.d, this.b);
        long size = this.d.size();
        InterfaceC0157u2 interfaceC0157u2 = this.a;
        interfaceC0157u2.k(size);
        if (this.c) {
            ArrayList arrayList = this.d;
            int size2 = arrayList.size();
            int i = 0;
            while (i < size2) {
                Object obj = arrayList.get(i);
                i++;
                if (interfaceC0157u2.m()) {
                    break;
                } else {
                    interfaceC0157u2.accept((InterfaceC0157u2) obj);
                }
            }
        } else {
            Collection.EL.a(this.d, new C0055a(6, interfaceC0157u2));
        }
        interfaceC0157u2.j();
        this.d = null;
    }

    @Override // j$.util.stream.AbstractC0138q2, j$.util.stream.InterfaceC0157u2
    public final void k(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }
}
