package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akkl implements dlbl {
    final /* synthetic */ akkn a;

    public akkl(akkn akknVar) {
        this.a = akknVar;
    }

    @Override // defpackage.dlbl
    public final PersephoneDownloadWorker a(Context context, WorkerParameters workerParameters) {
        dlij dE = this.a.a.dE();
        Optional.empty();
        akko akkoVar = this.a.a.b;
        akkoVar.a.dB();
        fbbf fbbfVar = akkoVar.dL;
        fbbfVar.getClass();
        Object b = fbbfVar.b();
        b.getClass();
        dlby dlbyVar = (dlby) b;
        dlpw dlpwVar = (dlpw) this.a.a.l.b();
        Optional of = Optional.of(new dkza());
        dlib dlibVar = (dlib) this.a.a.kN.b();
        akis akisVar = this.a.a;
        akis akisVar2 = akisVar.b.a;
        dlas dB = akisVar.dB();
        dlam dlamVar = new dlam((dlcr) akisVar2.kT.b());
        akis akisVar3 = this.a.a;
        return new PersephoneDownloadWorker(context, workerParameters, dE, dlbyVar, dlpwVar, (Optional<dkyz>) of, dlibVar, dB, dlamVar, akisVar3.dC(), akisVar3.dD(), akisVar3.dz(), (Optional<dlag>) Optional.empty());
    }
}
