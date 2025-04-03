package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayax extends ffhv implements ffjm {
    final /* synthetic */ ayba a;
    final /* synthetic */ List b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayax(ffgu ffguVar, ayba aybaVar, List list) {
        super(2, ffguVar);
        this.a = aybaVar;
        this.b = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayax) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bvvn e = ParticipantsTable.e();
        e.z("ScheduleDeleteAndImportContactsHandler#getBatchedSyncParameters");
        bvvw bvvwVar = new bvvw();
        bvvwVar.w(-2);
        bvvwVar.aq(new dtwe("participants.contact_id", 7, -1L));
        if (((atfe) this.a.g.b()).a()) {
            bvvwVar.o(false);
        }
        e.g(bvvwVar);
        e.t();
        e.c(ParticipantsTable.c.q);
        dtsu o = e.b().o();
        try {
            bvti bvtiVar = (bvti) o;
            while (bvtiVar.moveToNext()) {
                if (this.b.isEmpty() || ((axzp) ((axzo) ffdx.P(this.b)).instance).b.size() >= ((Number) axum.j.e()).intValue()) {
                    List list = this.b;
                    axzo axzoVar = (axzo) axzp.a.createBuilder();
                    int size = this.b.size() + 1;
                    axzoVar.copyOnWrite();
                    ((axzp) axzoVar.instance).c = size;
                    list.add(axzoVar);
                }
                axzo axzoVar2 = (axzo) ffdx.P(this.b);
                long f = bvtiVar.f();
                axzoVar2.copyOnWrite();
                axzp axzpVar = (axzp) axzoVar2.instance;
                eygl eyglVar = axzpVar.b;
                if (!eyglVar.c()) {
                    axzpVar.b = eyfy.mutableCopy(eyglVar);
                }
                axzpVar.b.g(f);
            }
            ffig.a(o, null);
            return ffcu.a;
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ayax ayaxVar = new ayax(ffguVar, this.a, this.b);
        ayaxVar.c = obj;
        return ayaxVar;
    }
}
