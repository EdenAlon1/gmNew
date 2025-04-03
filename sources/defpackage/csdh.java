package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csdh implements cscu {
    public static final cskc a = cskc.g("BugleCms", "CmsRestoreManagerImpl");
    public final babf b;
    public final axkm c;
    public final tsp d;
    public final cryz e;
    public final crtz f;
    public final csdp g;
    public final cins h;
    public final errl i;
    public final axdf j;
    public final errl k;
    public final cshm l;
    public final ffbr m;
    public final ffbr n;
    public final axmm o;
    public final ffbr p;
    public final arep q;
    public final cqiy r;
    public final cbwj s;
    private final cqoh t;
    private final ffbr u;
    private final ffbr v;
    private final ffbr w;
    private final azei x;

    /* compiled from: PG */
    public interface a {
        crvt eW();
    }

    public csdh(babf babfVar, axkm axkmVar, cbwj cbwjVar, tsp tspVar, cryz cryzVar, crtz crtzVar, axdf axdfVar, csdp csdpVar, cins cinsVar, cqoh cqohVar, cshm cshmVar, errl errlVar, errl errlVar2, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, axmm axmmVar, ffbr ffbrVar6, arep arepVar, cqiy cqiyVar, azei azeiVar) {
        this.b = babfVar;
        this.c = axkmVar;
        this.s = cbwjVar;
        this.d = tspVar;
        this.e = cryzVar;
        this.f = crtzVar;
        this.j = axdfVar;
        this.g = csdpVar;
        this.h = cinsVar;
        this.t = cqohVar;
        this.l = cshmVar;
        this.i = errlVar;
        this.k = errlVar2;
        this.m = ffbrVar;
        this.n = ffbrVar2;
        this.u = ffbrVar3;
        this.v = ffbrVar4;
        this.w = ffbrVar5;
        this.o = axmmVar;
        this.p = ffbrVar6;
        this.q = arepVar;
        this.r = cqiyVar;
        this.x = azeiVar;
    }

    @Override // defpackage.cscu
    public final cevg a(eisx eisxVar, csfz csfzVar) {
        if (((Boolean) this.w.b()).booleanValue()) {
            ((alrv) this.v.b()).e(alrv.P);
        }
        this.x.d(new Consumer() { // from class: csde
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((ceeu) obj).g();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        try {
            final cejj cejjVar = (cejj) cejk.b.createBuilder();
            int a2 = eisxVar.a();
            cejjVar.copyOnWrite();
            cejk cejkVar = (cejk) cejjVar.instance;
            cejkVar.c |= 1;
            cejkVar.d = a2;
            cejo cejoVar = cejo.BACKUP_KEY;
            cejjVar.copyOnWrite();
            cejk cejkVar2 = (cejk) cejjVar.instance;
            cejkVar2.e = cejoVar.g;
            cejkVar2.c |= 2;
            cejjVar.copyOnWrite();
            cejk cejkVar3 = (cejk) cejjVar.instance;
            cejkVar3.c |= 8;
            cejkVar3.g = false;
            int i = csfzVar.d;
            cejjVar.copyOnWrite();
            cejk cejkVar4 = (cejk) cejjVar.instance;
            cejkVar4.c |= 16;
            cejkVar4.h = i;
            eyja d = eykm.d(this.t.f().toEpochMilli());
            cejjVar.copyOnWrite();
            cejk cejkVar5 = (cejk) cejjVar.instance;
            d.getClass();
            cejkVar5.i = d;
            cejkVar5.c |= 32;
            eyja d2 = eykm.d(this.t.f().toEpochMilli());
            cejjVar.copyOnWrite();
            cejk cejkVar6 = (cejk) cejjVar.instance;
            d2.getClass();
            cejkVar6.j = d2;
            cejkVar6.c |= 64;
            cejjVar.a(cejo.ENCRYPTION_KEYS);
            cejjVar.a(cejo.PARTICIPANTS);
            cejjVar.a(cejo.CONVERSATIONS);
            cejjVar.a(cejo.MESSAGES);
            if (csfzVar != csfz.BACKUP_AND_RESTORE) {
                return (cevg) this.s.a.c("CmsRestoreManagerImpl#enqueueRestoreWorkUsingPwq", new emyl() { // from class: csdf
                    @Override // defpackage.emyl
                    public final Object get() {
                        csdh csdhVar = csdh.this;
                        csdhVar.r.h();
                        boolean booleanValue = ((Boolean) ((cfup) csgj.M.get()).e()).booleanValue();
                        cejj cejjVar2 = cejjVar;
                        if (!booleanValue) {
                            return ((cevh) ((ceib) csdhVar.m.b()).a.b()).a(ceyr.g("cms_restore_page", (cejk) cejjVar2.build()));
                        }
                        cejjVar2.copyOnWrite();
                        cejk cejkVar7 = (cejk) cejjVar2.instance;
                        eygj eygjVar = cejk.a;
                        cejkVar7.c |= 128;
                        cejkVar7.l = true;
                        return ((cevh) ((cehz) csdhVar.n.b()).a.b()).a(ceyr.g("cms_restore_page_foreground", (cejk) cejjVar2.build()));
                    }
                });
            }
            return ((cevh) ((cdyj) this.u.b()).a.b()).a(ceyr.g("disable_multi_device_on_server_when_enable_bnr", (cejk) cejjVar.build()));
        } catch (RuntimeException e) {
            this.x.d(new Consumer() { // from class: csdg
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((ceeu) obj).r();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            throw e;
        }
    }

    public final void b() {
        this.c.ap();
    }
}
