package defpackage;

import android.os.ParcelFileDescriptor;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sll extends ffhv implements ffjm {
    int a;
    final /* synthetic */ skj b;
    final /* synthetic */ ParcelFileDescriptor c;
    final /* synthetic */ fflb d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sll(ffgu ffguVar, skj skjVar, ParcelFileDescriptor parcelFileDescriptor, fflb fflbVar) {
        super(2, ffguVar);
        this.b = skjVar;
        this.c = parcelFileDescriptor;
        this.d = fflbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sll) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        try {
            try {
                if (this.a != 0) {
                    ffci.b(obj);
                } else {
                    ffci.b(obj);
                    skj skjVar = this.b;
                    ParcelFileDescriptor parcelFileDescriptor = this.c;
                    parcelFileDescriptor.getClass();
                    this.a = 1;
                    Object a = ffra.a(ekxi.a(skjVar.b), new ski(null, skjVar, parcelFileDescriptor), this);
                    if (a != ffhh.a) {
                        a = ffcu.a;
                    }
                    if (a == obj2) {
                        return obj2;
                    }
                }
                this.b.b();
                return ffcu.a;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                throw new slp(e2, (skk) this.d.a);
            }
        } catch (Throwable th) {
            this.b.b();
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        sll sllVar = new sll(ffguVar, this.b, this.c, this.d);
        sllVar.e = obj;
        return sllVar;
    }
}
