package defpackage;

import android.os.Parcel;
import io.grpc.Status;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fegg extends fegj {
    private final feft a;

    public fegg(feft feftVar, fdxd fdxdVar, int i) {
        super(feftVar, fdxdVar, i);
        this.a = feftVar;
    }

    @Override // defpackage.fegj
    protected final void a(Status status) {
        ((fevd) this.g).a(status);
    }

    @Override // defpackage.fegj
    protected final void b() {
        ((fevd) this.g).b();
    }

    @Override // defpackage.fegj
    public final void c(int i, Parcel parcel) {
        fevo fevoVar;
        fdxd fdxdVar = this.c;
        String readString = parcel.readString();
        febo a = fegn.a(parcel, fdxdVar);
        fevo fevoVar2 = fevo.a;
        List list = this.a.a;
        if (list.isEmpty()) {
            fevoVar = fevo.a;
        } else {
            int size = list.size();
            fedo[] fedoVarArr = new fedo[size];
            for (int i2 = 0; i2 < size; i2++) {
                fedoVarArr[i2] = ((fedc) list.get(i2)).a();
            }
            fevoVar = new fevo(fedoVarArr);
        }
        fegw fegwVar = new fegw(this.a, this.d, fevoVar);
        Status b = this.a.b((i & 16) != 0 ? new fehn(this, fegwVar, this.c) : new fegp(this, fegwVar, this.c), readString, a);
        if (!b.f()) {
            h(b);
            return;
        }
        ((fevd) this.g).getClass();
        if (this.b.v()) {
            ((fevd) this.g).e();
        }
    }

    final void f() {
        if (p()) {
            return;
        }
        m(fegh.CLOSED);
        this.f.m();
        ((fevd) this.g).a(Status.b);
    }

    @Override // defpackage.fegj
    public final void d(int i, Parcel parcel) {
    }
}
