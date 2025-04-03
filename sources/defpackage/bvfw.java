package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bvfw extends dtrr {
    public String a;
    public MessageIdType b;
    public long c;
    public fbxa d;
    public fbri e;
    public fbrd f;
    public fbre g;

    public bvfw() {
        super(bvhn.e());
        this.b = bdhb.a;
        this.c = 0L;
        this.e = fbri.UNKNOWN_SUGGESTION_TYPE;
        this.f = fbrd.UNKNOWN_STATUS;
        this.g = fbre.UNCONSUMED;
    }

    public final bvfs a() {
        return b(new Supplier() { // from class: bvfu
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bvft();
            }
        });
    }

    public final bvfs b(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        bvfs bvfsVar = (bvfs) obj;
        bvfsVar.aC(aB());
        fbxa fbxaVar = this.d;
        if (fbxaVar == null) {
            throw new IllegalStateException("field suggestion cannot be null");
        }
        bvfsVar.a = this.a;
        bvfsVar.b = this.b;
        bvfsVar.c = this.c;
        bvfsVar.d = fbxaVar;
        bvfsVar.e = this.e;
        bvfsVar.f = this.f;
        bvfsVar.g = this.g;
        bvfsVar.cK = aC();
        return bvfsVar;
    }

    public final void c(long j) {
        aE(2);
        this.c = j;
    }

    public final void d(fbri fbriVar) {
        aE(4);
        this.e = fbriVar;
    }

    public final void e(fbxa fbxaVar) {
        aE(3);
        this.d = fbxaVar;
    }

    public final void f(fbrd fbrdVar) {
        aE(5);
        this.f = fbrdVar;
    }

    public final void g(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }
}
