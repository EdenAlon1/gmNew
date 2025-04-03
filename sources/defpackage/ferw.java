package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ferw extends feaq {
    public final feai f;
    public fdyc g = fdyc.IDLE;
    private fean h;

    public ferw(feai feaiVar) {
        this.f = feaiVar;
    }

    @Override // defpackage.feaq
    public final Status a(feam feamVar) {
        fers fersVar;
        Boolean bool;
        List list = feamVar.a;
        if (list.isEmpty()) {
            List list2 = feamVar.a;
            Status withDescription = Status.p.withDescription("NameResolver returned no usable address. addrs=" + String.valueOf(list2) + ", attrs=" + feamVar.b.toString());
            b(withDescription);
            return withDescription;
        }
        Object obj = feamVar.c;
        if ((obj instanceof fers) && (bool = (fersVar = (fers) obj).a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(list);
            Long l = fersVar.b;
            Collections.shuffle(arrayList, new Random());
            list = arrayList;
        }
        fean feanVar = this.h;
        if (feanVar == null) {
            feai feaiVar = this.f;
            fead feadVar = new fead();
            feadVar.c(list);
            fean b = feaiVar.b(feadVar.a());
            b.c(new ferr(this, b));
            this.h = b;
            f(fdyc.CONNECTING, new fert(feak.c(b)));
            b.a();
        } else {
            feanVar.d(list);
        }
        return Status.b;
    }

    @Override // defpackage.feaq
    public final void b(Status status) {
        fean feanVar = this.h;
        if (feanVar != null) {
            feanVar.b();
            this.h = null;
        }
        f(fdyc.TRANSIENT_FAILURE, new fert(feak.b(status)));
    }

    @Override // defpackage.feaq
    public final void d() {
        fean feanVar = this.h;
        if (feanVar != null) {
            feanVar.a();
        }
    }

    @Override // defpackage.feaq
    public final void e() {
        fean feanVar = this.h;
        if (feanVar != null) {
            feanVar.b();
        }
    }

    public final void f(fdyc fdycVar, feao feaoVar) {
        this.g = fdycVar;
        this.f.f(fdycVar, feaoVar);
    }
}
