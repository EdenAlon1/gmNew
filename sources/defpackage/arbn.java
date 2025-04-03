package defpackage;

import android.content.Context;
import com.google.android.gms.audit.LogAuditRecordsRequest;
import com.google.android.gms.audit.internal.IAuditService;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class arbn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ arbr b;
    final /* synthetic */ arbo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arbn(arbr arbrVar, arbo arboVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = arbrVar;
        this.c = arboVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((arbn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ensk h = arbo.a.h();
            h.Y(ente.a, "Bugle");
            ((enrr) h.h("com/google/android/apps/messaging/shared/ari/AriWorkHandler$processPendingWorkItemAsync$1", "invokeSuspend", 54, "AriWorkHandler.kt")).q("Start to process ari request");
            ArrayList arrayList = new ArrayList();
            String str = this.b.c;
            evum evumVar = (evum) evun.a.createBuilder();
            evup a = dezf.a();
            evumVar.copyOnWrite();
            evun evunVar = (evun) evumVar.instance;
            a.getClass();
            evunVar.c = a;
            evunVar.b |= 1;
            eyee x = eyee.x(((evun) evumVar.build()).toByteArray());
            ewfz ewfzVar = (ewfz) ewga.a.createBuilder();
            ewfzVar.copyOnWrite();
            ewga ewgaVar = (ewga) ewfzVar.instance;
            ewgaVar.b |= 1;
            ewgaVar.c = x;
            eyfy build = ewfzVar.build();
            build.getClass();
            byte[] byteArray = ((ewga) build).toByteArray();
            ewfy ewfyVar = this.b.d;
            if (ewfyVar == null) {
                ewfyVar = ewfy.a;
            }
            arrayList.add(ewfyVar.toByteArray());
            arbo arboVar = this.c;
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("Must specify at least one audit record.");
            }
            Object obj2 = arboVar.b;
            final LogAuditRecordsRequest logAuditRecordsRequest = new LogAuditRecordsRequest(1, 294, str, (byte[][]) arrayList.toArray(new byte[0][]), null, byteArray);
            dfun dfunVar = new dfun();
            dfunVar.c = 6901;
            dfunVar.a = new dfuf() { // from class: deza
                @Override // defpackage.dfuf
                public final void a(Object obj3, Object obj4) {
                    dezg dezgVar = (dezg) obj3;
                    int i2 = dezd.a;
                    dezc dezcVar = new dezc((dhri) obj4);
                    Context context = dezgVar.c;
                    ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
                    ((IAuditService) dezgVar.w()).logAuditRecords(LogAuditRecordsRequest.this, dezcVar, new ApiMetadata(complianceOptions));
                }
            };
            dhre l = ((dfra) obj2).l(dfunVar.a());
            this.a = 1;
            obj = axpj.a(l, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        Status status = (Status) obj;
        if (status.d()) {
            return ceyt.i();
        }
        ensk j = arbo.a.j();
        j.Y(ente.a, "Bugle");
        ((enrr) j.h("com/google/android/apps/messaging/shared/ari/AriWorkHandler$processPendingWorkItemAsync$1", "invokeSuspend", 65, "AriWorkHandler.kt")).r("Failed to log audit records. status_code=%s", status.f);
        return ceyt.m();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new arbn(this.b, this.c, ffguVar);
    }
}
