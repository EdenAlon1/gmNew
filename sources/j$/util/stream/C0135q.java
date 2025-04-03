package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0135q extends AbstractC0138q2 {
    public final /* synthetic */ int b = 2;
    boolean c;
    Object d;

    public /* synthetic */ C0135q(InterfaceC0157u2 interfaceC0157u2) {
        super(interfaceC0157u2);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                InterfaceC0157u2 interfaceC0157u2 = this.a;
                if (obj == null) {
                    if (this.c) {
                        return;
                    }
                    this.c = true;
                    this.d = null;
                    interfaceC0157u2.accept((InterfaceC0157u2) null);
                    return;
                }
                Object obj2 = this.d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.d = obj;
                    interfaceC0157u2.accept((InterfaceC0157u2) obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((C0093h2) this.d).n.apply(obj);
                if (stream != null) {
                    try {
                        boolean z = this.c;
                        InterfaceC0157u2 interfaceC0157u22 = this.a;
                        if (z) {
                            Spliterator<T> spliterator2 = ((Stream) stream.sequential()).spliterator2();
                            while (!interfaceC0157u22.m() && spliterator2.tryAdvance(interfaceC0157u22)) {
                            }
                        } else {
                            ((Stream) stream.sequential()).forEach(interfaceC0157u22);
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.c) {
                    boolean test = ((b4) this.d).m.test(obj);
                    this.c = test;
                    if (test) {
                        this.a.accept((InterfaceC0157u2) obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0138q2, j$.util.stream.InterfaceC0157u2
    public void j() {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.j();
                break;
            default:
                super.j();
                break;
        }
    }

    @Override // j$.util.stream.AbstractC0138q2, j$.util.stream.InterfaceC0157u2
    public final void k(long j) {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.k(-1L);
                break;
            case 1:
                this.a.k(-1L);
                break;
            default:
                this.a.k(-1L);
                break;
        }
    }

    @Override // j$.util.stream.AbstractC0138q2, j$.util.stream.InterfaceC0157u2
    public boolean m() {
        switch (this.b) {
            case 1:
                this.c = true;
                return this.a.m();
            case 2:
                return !this.c || this.a.m();
            default:
                return super.m();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0135q(b4 b4Var, InterfaceC0157u2 interfaceC0157u2) {
        super(interfaceC0157u2);
        this.d = b4Var;
        this.c = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0135q(C0093h2 c0093h2, InterfaceC0157u2 interfaceC0157u2) {
        super(interfaceC0157u2);
        this.d = c0093h2;
    }
}
