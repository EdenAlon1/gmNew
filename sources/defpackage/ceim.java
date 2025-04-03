package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceim extends ffhv implements ffjm {
    final /* synthetic */ ceiw a;
    final /* synthetic */ cehx b;
    final /* synthetic */ emyg c;
    final /* synthetic */ cejk d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceim(ffgu ffguVar, ceiw ceiwVar, cehx cehxVar, emyg emygVar, cejk cejkVar) {
        super(2, ffguVar);
        this.a = ceiwVar;
        this.b = cehxVar;
        this.c = emygVar;
        this.d = cejkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ceim) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r8v10, types: [comc, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ffbz ffbzVar = ceiw.a;
        ceiw ceiwVar = this.a;
        final axkm axkmVar = ceiwVar.c;
        final Duration d = this.c.d();
        final Instant ofEpochMilli = Instant.ofEpochMilli(ceiwVar.d.f().toEpochMilli());
        boolean z = false;
        if (ceix.a(this.d)) {
            cejo b = cejo.b(this.d.e);
            if (b == null) {
                b = cejo.NONE;
            }
            if (b == cejo.BACKUP_KEY) {
                z = true;
            }
        }
        final boolean z2 = z;
        cehx cehxVar = this.b;
        efbd.b();
        final Instant minus = ofEpochMilli.minus(d);
        emyl emylVar = axkmVar.e;
        final String str = cehxVar.n;
        emylVar.get().m(new emwl() { // from class: axhy
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                axkm axkmVar2 = axkm.this;
                axez axezVar = (axez) obj2;
                if (z2) {
                    axkv axkvVar = axezVar.G;
                    if (axkvVar == null) {
                        axkvVar = axkv.a;
                    }
                    if (!axkvVar.equals(axkv.a)) {
                        ensk h = axkm.b.h();
                        h.Y(ente.a, "BugleCms");
                        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/cloudstore/cmssettingsdata/CmsSettingsDataService", "setInitialRestorePageWorkerTimingStats", 2002, "CmsSettingsDataService.java")).q("Resetting uncleared InitialRestoreExecutionTime.");
                        axep builder = axezVar.toBuilder();
                        builder.copyOnWrite();
                        axez axezVar2 = (axez) builder.instance;
                        axezVar2.G = null;
                        axezVar2.c &= -5;
                        axezVar = builder.build();
                        axkmVar2.i.a(false);
                    }
                }
                axkv axkvVar2 = axezVar.G;
                if (axkvVar2 == null) {
                    axkvVar2 = axkv.a;
                }
                axku axkuVar = (axku) axkvVar2.toBuilder();
                if (axkmVar2.i.a.get()) {
                    Instant instant = minus;
                    axkv axkvVar3 = (axkv) axkuVar.instance;
                    long j = axkvVar3.g;
                    long j2 = axkvVar3.f;
                    emxf.b(j2 != 0, "The last scheduled time should be set before computing duration.");
                    if (instant.toEpochMilli() >= j2) {
                        long epochMilli = j + instant.minusMillis(j2).toEpochMilli();
                        axkuVar.copyOnWrite();
                        axkv axkvVar4 = (axkv) axkuVar.instance;
                        axkvVar4.b |= 16;
                        axkvVar4.g = epochMilli;
                    } else {
                        ensk j3 = axkm.b.j();
                        j3.Y(ente.a, "BugleCms");
                        ((enrr) ((enrr) j3).h("com/google/android/apps/messaging/shared/cloudstore/cmssettingsdata/CmsSettingsDataService", "setInitialRestorePageWorkerTimingStats", 2027, "CmsSettingsDataService.java")).q("The start time should not be less than end time.");
                    }
                } else {
                    axkmVar2.i.a(true);
                    axkuVar.copyOnWrite();
                    axkv axkvVar5 = (axkv) axkuVar.instance;
                    axkvVar5.b |= 8;
                    axkvVar5.f = 0L;
                }
                Duration duration = d;
                String str2 = str;
                if (str2.equals("Participants")) {
                    long millis = ((axkv) axkuVar.instance).c + duration.toMillis();
                    axkuVar.copyOnWrite();
                    axkv axkvVar6 = (axkv) axkuVar.instance;
                    axkvVar6.b |= 1;
                    axkvVar6.c = millis;
                }
                if (str2.equals("Conversations")) {
                    long millis2 = ((axkv) axkuVar.instance).d + duration.toMillis();
                    axkuVar.copyOnWrite();
                    axkv axkvVar7 = (axkv) axkuVar.instance;
                    axkvVar7.b |= 2;
                    axkvVar7.d = millis2;
                }
                if (str2.equals("Messages")) {
                    long millis3 = ((axkv) axkuVar.instance).e + duration.toMillis();
                    axkuVar.copyOnWrite();
                    axkv axkvVar8 = (axkv) axkuVar.instance;
                    axkvVar8.b |= 4;
                    axkvVar8.e = millis3;
                }
                long epochMilli2 = ofEpochMilli.toEpochMilli();
                axkuVar.copyOnWrite();
                axkv axkvVar9 = (axkv) axkuVar.instance;
                axkvVar9.b |= 8;
                axkvVar9.f = epochMilli2;
                axep builder2 = axezVar.toBuilder();
                axkv axkvVar10 = (axkv) axkuVar.build();
                builder2.copyOnWrite();
                axez axezVar3 = (axez) builder2.instance;
                axkvVar10.getClass();
                axezVar3.G = axkvVar10;
                axezVar3.c |= 4;
                return builder2.build();
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ceim ceimVar = new ceim(ffguVar, this.a, this.b, this.c, this.d);
        ceimVar.e = obj;
        return ceimVar;
    }
}
