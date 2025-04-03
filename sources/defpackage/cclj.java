package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cclj implements ccdx {
    public static final cskc a = cskc.g("BugleCms", "CmsKeyObjectConsumer");
    public final crwa b;
    public final dtuu c;
    public final cdsm d;
    public final ffbr e;
    public final cqoh f;
    private final errl g;

    public cclj(crwa crwaVar, dtuu dtuuVar, cdsm cdsmVar, errl errlVar, ffbr ffbrVar, cqoh cqohVar) {
        this.b = crwaVar;
        this.c = dtuuVar;
        this.d = cdsmVar;
        this.g = errlVar;
        this.e = ffbrVar;
        this.f = cqohVar;
    }

    public static void e(bqvj bqvjVar, String str) {
        try {
            if (bqvjVar.m().longValue() >= 0) {
                return;
            }
            csjb e = a.e();
            e.I("Insert key failed");
            e.A("Cms Object Id", str);
            e.r();
            throw new cclh();
        } catch (Throwable th) {
            if ((asvl.a() || csgj.a()) && (th instanceof Error)) {
                throw th;
            }
            csjb e2 = a.e();
            e2.I("Insert key threw");
            e2.A("Cms Object Id", str);
            e2.s(th);
            throw new ccli(th);
        }
    }

    @Override // defpackage.ccdx
    public final elfl a(engw engwVar, Optional optional, boolean z) {
        throw new UnsupportedOperationException("Restoring Key Objects in batch is not supported yet.");
    }

    @Override // defpackage.ccdx
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }

    @Override // defpackage.ccdx
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ccdx
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final elfl d(final eszz eszzVar) {
        elfl e;
        if (!csgj.a()) {
            return elfo.g(new Callable() { // from class: ccld
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final bqvj a2;
                    cclj ccljVar = cclj.this;
                    crwa crwaVar = ccljVar.b;
                    final eszz eszzVar2 = eszzVar;
                    crwl a3 = crwaVar.a(eszzVar2);
                    etao etaoVar = a3.b.i;
                    if (etaoVar == null) {
                        etaoVar = etao.a;
                    }
                    eydq eydqVar = ((etaq) etaoVar.b.get(0)).g;
                    if (eydqVar == null) {
                        eydqVar = eydq.a;
                    }
                    try {
                        esij esijVar = (esij) eyfy.parseFrom(esij.a, eydqVar.c);
                        eyee eyeeVar = esijVar.b;
                        int i = esijVar.c;
                        if (i != -1) {
                            a2 = a3.b(eyeeVar, i);
                        } else {
                            try {
                                a2 = a3.a((eshl) eyfy.parseFrom(eshl.a, eyeeVar));
                            } catch (eygu e2) {
                                throw new crwf(e2, "Failed to create ".concat(String.valueOf(eshl.class.getSimpleName())));
                            }
                        }
                        Optional a4 = ccljVar.d.a(a2);
                        if (!a4.isPresent()) {
                            return (Void) ccljVar.c.c("CmsKeyObjectConsumer#restoreCmsItemDataEncryptedBackupOff", new emyl() { // from class: ccle
                                @Override // defpackage.emyl
                                public final Object get() {
                                    cclj.e(bqvj.this, eszzVar2.c);
                                    return null;
                                }
                            });
                        }
                        ccljVar.d.b(a2, ((bqvj) a4.get()).k(), ((bqvj) a4.get()).l());
                        return null;
                    } catch (eygu e3) {
                        throw new crwk(e3, String.format("Failed to parse %s from %s", eshl.class.getSimpleName(), esij.class.getSimpleName()));
                    }
                }
            }, this.g);
        }
        final crwl a2 = this.b.a(eszzVar);
        cqoh cqohVar = this.f;
        eszz eszzVar2 = a2.b;
        final long a3 = cqohVar.a();
        etao etaoVar = eszzVar2.i;
        if (etaoVar == null) {
            etaoVar = etao.a;
        }
        eydq eydqVar = ((etaq) etaoVar.b.get(0)).g;
        if (eydqVar == null) {
            eydqVar = eydq.a;
        }
        try {
            esij esijVar = (esij) eyfy.parseFrom(esij.a, eydqVar.c, eyfc.a());
            final eyee eyeeVar = esijVar.b;
            int i = esijVar.c;
            if (i == -1) {
                try {
                    e = elfo.e(a2.a((eshl) eyfy.parseFrom(eshl.a, eyeeVar, eyfc.a())));
                } catch (eygu e2) {
                    throw new crwf(e2, "Failed to create ".concat(String.valueOf(eshl.class.getSimpleName())));
                }
            } else {
                e = a2.b.h.contains("encrypted_backup_key") ? a2.c.a().i(new eroh() { // from class: crwc
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        final List list = (List) obj;
                        final crwl crwlVar = crwl.this;
                        final eyee eyeeVar2 = eyeeVar;
                        return elfo.g(new Callable() { // from class: crwb
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                crwl crwlVar2 = crwl.this;
                                crpo a4 = crwlVar2.f.a(engw.n(list));
                                crwl.a.p("Instantiated GmsCryptor to decrypt Backup Key");
                                eyee a5 = a4.a(eyeeVar2);
                                crwl.a.p("Decrypted Backup Key with GmsCryptor");
                                eshl eshlVar = (eshl) eyfy.parseFrom(eshl.a, a5, eyfc.a());
                                crwl.a.p("Created CmsKeyEntry for encrypted Backup Key");
                                return crwlVar2.a(eshlVar);
                            }
                        }, crwlVar.e);
                    }
                }, a2.d).f(GeneralSecurityException.class, new eroh() { // from class: crwd
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return elfo.d(new crwh((GeneralSecurityException) obj));
                    }
                }, a2.e).f(eygu.class, new eroh() { // from class: crwe
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return elfo.d(new crwf((eygu) obj, "Failed to create " + eshl.class.getSimpleName() + " when decrypting encrypted Backup Key"));
                    }
                }, a2.e) : elfo.e(a2.b(eyeeVar, i));
            }
            return e.h(new emwl() { // from class: cclg
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    cclj ccljVar = cclj.this;
                    final bqvj bqvjVar = (bqvj) obj;
                    Optional a4 = ccljVar.d.a(bqvjVar);
                    ((akzt) ccljVar.e.b()).e("Bugle.Cms.Restore.Key.Outcome", true != a4.isPresent() ? 5 : 3);
                    if (a4.isPresent()) {
                        long j = a3;
                        ccljVar.d.b(bqvjVar, ((bqvj) a4.get()).k(), ((bqvj) a4.get()).l());
                        ((akzt) ccljVar.e.b()).g("Bugle.Cms.Restore.Key.DuplicateSearchDuration", ccljVar.f.a() - j);
                        return null;
                    }
                    final eszz eszzVar3 = eszzVar;
                    csjb c = cclj.a.c();
                    c.I("Inserting restored key to BugleDb");
                    c.A("Cms Object Id", eszzVar3.c);
                    c.A("Cms labels", eszzVar3.h);
                    c.y("Key type", bqvjVar.l());
                    c.r();
                    return (Void) ccljVar.c.c("CmsKeyObjectConsumer#restoreCmsItemDataEncryptedBackupOn", new emyl() { // from class: cclf
                        @Override // defpackage.emyl
                        public final Object get() {
                            cclj.e(bqvj.this, eszzVar3.c);
                            return null;
                        }
                    });
                }
            }, this.g);
        } catch (eygu e3) {
            throw new crwk(e3, String.format("Failed to parse %s from %s", eshl.class.getSimpleName(), esij.class.getSimpleName()));
        }
    }
}
