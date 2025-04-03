package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdrv implements cskg {
    public static final /* synthetic */ int a = 0;
    private static final entd b;
    private static final List c;
    private static final Set d;
    private final ffbr e;
    private final ffbr f;

    static {
        cfvl.w("enable_participant_destination_mutation_logger").getClass();
        b = entd.c("BugleParticipantData");
        c = ffdx.g(bdsp.c, bdsp.j, bdsp.f, bdsp.h, bdsp.d);
        d = new LinkedHashSet();
    }

    public bdrv(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.e = ffbrVar;
        this.f = ffbrVar2;
    }

    private static final boolean c(bdsp bdspVar, String str) {
        return (str != null && bdspVar == bdsp.i && d.contains(str)) ? false : true;
    }

    public final int a(bvvq bvvqVar) {
        engw<ParticipantsTable.BindData> a2 = bvvqVar.a();
        for (ParticipantsTable.BindData bindData : a2) {
            bdsv.b((bdsv) this.e.b(), bindData.U(), bindData.W(), bvvqVar.c(), bvvqVar.d(), false, false, null, 1008);
        }
        return a2.size();
    }

    public final int b(final bvvr bvvrVar, bdsp bdspVar) {
        boolean z;
        boolean z2;
        boolean z3;
        bdspVar.getClass();
        ekzz f = eleg.f("validateDestinationsThenExecuteUpdate");
        try {
            final ffkz ffkzVar = new ffkz();
            final fflb fflbVar = new fflb();
            fflbVar.a = ffel.a;
            bvvq b2 = bvvrVar.b();
            boolean z4 = true;
            if (c.contains(bdspVar)) {
                z = false;
                z2 = false;
            } else {
                if (c(bdspVar, bvvrVar.a.getAsString("send_destination"))) {
                    bvvrVar.ai(ParticipantsTable.c.g);
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c(bdspVar, bvvrVar.a.getAsString("normalized_destination"))) {
                    bvvrVar.ai(ParticipantsTable.c.f);
                    z = z3;
                    z2 = true;
                } else {
                    z = z3;
                    z2 = false;
                }
            }
            ((dtuu) this.f.b()).d("validateDestinationsThenExecuteUpdate", new Runnable() { // from class: bdru
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    int i = bdrv.a;
                    bvvn e = ParticipantsTable.e();
                    e.r();
                    bvvr bvvrVar2 = bvvr.this;
                    engw engwVar = bvvrVar2.b().e;
                    engwVar.getClass();
                    enqv it = engwVar.iterator();
                    while (it.hasNext()) {
                        duap duapVar = (duap) it.next();
                        duapVar.getClass();
                        e.k((bvvs) duapVar);
                    }
                    fflb fflbVar2 = fflbVar;
                    e.z("validateDestinationsThenExecuteUpdate");
                    fflbVar2.a = e.b().y();
                    bvvq b3 = bvvrVar2.b();
                    ffkzVar.a = b3.o() ? 0 : b3.e();
                }
            });
            for (ParticipantsTable.BindData bindData : (Iterable) fflbVar.a) {
                bdsv.b((bdsv) this.e.b(), bindData.U(), bindData.W(), b2.c(), b2.d(), z, z2, bdspVar.name(), 112);
            }
            if (!z) {
                if (z2) {
                }
                int i = ffkzVar.a;
                ffig.a(f, null);
                return i;
            }
            z4 = z2;
            ensz enszVar = (ensz) b.h();
            enszVar.W(5, TimeUnit.SECONDS);
            Iterable iterable = (Iterable) fflbVar.a;
            ArrayList arrayList = new ArrayList(ffdx.n(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((ParticipantsTable.BindData) it.next()).S());
            }
            enszVar.J("Blocked participant destination update: participantIds [%s], blockedSendDestinationUpdate [%s], blockedNormalizedDestinationUpdate [%s]", arrayList, Boolean.valueOf(z), Boolean.valueOf(z4));
            int i2 = ffkzVar.a;
            ffig.a(f, null);
            return i2;
        } finally {
        }
    }

    @Override // defpackage.cskg
    public final void l(int i) {
        if (i == 80) {
            d.clear();
        }
    }
}
