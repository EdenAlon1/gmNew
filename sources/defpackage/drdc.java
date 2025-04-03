package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drdc extends ffhv implements ffjm {
    final /* synthetic */ drdd a;
    final /* synthetic */ int b;
    final /* synthetic */ OutputStream c;
    final /* synthetic */ drcy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drdc(drdd drddVar, int i, OutputStream outputStream, drcy drcyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = drddVar;
        this.b = i;
        this.c = outputStream;
        this.d = drcyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drdc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        drdd drddVar = this.a;
        if (drddVar.b()) {
            throw new IllegalStateException("Cannot start again while encoding session is in progress.");
        }
        int i = this.b;
        qri a = drddVar.a();
        boolean z = true;
        if (i <= 0) {
            i = 1;
        }
        a.k = i;
        drdd drddVar2 = this.a;
        OutputStream outputStream = this.c;
        qri a2 = drddVar2.a();
        if (outputStream != null) {
            a2.e = outputStream;
            try {
                a2.a("GIF89a");
            } catch (IOException unused) {
                z = false;
            }
            a2.d = z;
        }
        this.a.d = ffwp.a(Alert.DURATION_SHOW_INDEFINITELY, 0, 6);
        drdd drddVar3 = this.a;
        drddVar3.c = ffqy.c(drddVar3.b, null, new drdb(drddVar3, this.d, null), 3);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drdc(this.a, this.b, this.c, this.d, ffguVar);
    }
}
