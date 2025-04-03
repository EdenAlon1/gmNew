package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class avtr implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final crbv apply(crcb crcbVar) {
        entd entdVar = crbv.h;
        crbf crbfVar = new crbf();
        if ((crcbVar.b & 64) != 0) {
            emwd emwdVar = avua.a;
            awup awupVar = crcbVar.i;
            if (awupVar == null) {
                awupVar = awup.a;
            }
            crbfVar.d((ContentType) emwdVar.fP(awupVar));
        }
        b(crcbVar, crbfVar);
        if ((crcbVar.b & 4) != 0) {
            crbfVar.f(crcbVar.e);
        }
        if ((crcbVar.b & 256) != 0) {
            crbfVar.g(crcbVar.k);
        }
        if ((crcbVar.b & 128) != 0) {
            emwd emwdVar2 = avua.a;
            awup awupVar2 = crcbVar.j;
            if (awupVar2 == null) {
                awupVar2 = awup.a;
            }
            crbfVar.h((ContentType) emwdVar2.fP(awupVar2));
        }
        if ((crcbVar.b & 8) != 0) {
            crbfVar.i(crcbVar.f);
        }
        return crbfVar.j();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(crcb crcbVar, crbu crbuVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
