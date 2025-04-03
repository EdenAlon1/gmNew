package defpackage;

import java.security.GeneralSecurityException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crvz extends crvh implements crvy {
    private static final cskc b = cskc.g("BugleCms", "CmsCipherKeyBuilderImpl");
    private static final cskc c = cskc.g("BugleCmsFolsom", "CmsCipherKeyBuilderImpl");
    private final crpp d;

    public crvz(crpp crppVar, ffbr ffbrVar) {
        super(ffbrVar);
        this.d = crppVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static eshl e(bqvj bqvjVar) {
        eshk eshkVar = (eshk) eshl.a.createBuilder();
        byte[] q = bqvjVar.q();
        if (q == null) {
            return null;
        }
        eyee x = eyee.x(q);
        eshkVar.copyOnWrite();
        ((eshl) eshkVar.instance).c = x;
        eshm eshmVar = (eshm) ((enot) csbr.k).d.get(Integer.valueOf(bqvjVar.l()));
        if (eshmVar == null) {
            return null;
        }
        eshkVar.copyOnWrite();
        ((eshl) eshkVar.instance).d = eshmVar.a();
        int k = bqvjVar.k();
        eshkVar.copyOnWrite();
        ((eshl) eshkVar.instance).b = k;
        return (eshl) eshkVar.build();
    }

    private final eszz f(bqvj bqvjVar, engw engwVar, boolean z) {
        efbd.b();
        emxf.a(bqvjVar.l() == 2);
        cskc cskcVar = c;
        csjb c2 = cskcVar.c();
        c2.B("isUpdate", z);
        c2.I("Building encrypted Backup Key...");
        c2.r();
        if (engwVar.isEmpty()) {
            csjb e = cskcVar.e();
            e.B("isUpdate", z);
            e.I("No folsomKeys are available.");
            e.r();
            throw new csha(73, csgx.NO_RETRY);
        }
        try {
            crpo a = this.d.a(engwVar);
            eshl e2 = e(bqvjVar);
            if (e2 == null) {
                throw new csha(75, csgx.NO_RETRY);
            }
            String n = bqvjVar.n();
            String.format(Locale.US, "CorrelationId expected to be populated for Backup Key. key index = %d", Integer.valueOf(bqvjVar.k()));
            n.getClass();
            eyee byteString = e2.toByteString();
            int k = bqvjVar.k();
            try {
                esii esiiVar = (esii) esij.a.createBuilder();
                esiiVar.copyOnWrite();
                ((esij) esiiVar.instance).c = k;
                eyee b2 = a.b(byteString);
                esiiVar.copyOnWrite();
                ((esij) esiiVar.instance).b = b2;
                etao i = i((esij) esiiVar.build());
                csjb c3 = cskcVar.c();
                c3.B("isUpdate", z);
                c3.I("Built payload for encrypted Backup Key");
                c3.r();
                return z ? h(bqvjVar, "encrypted_backup_key", i) : g(bqvjVar, n, "encrypted_backup_key", i);
            } catch (Exception e3) {
                b.o("Failed to encrypt Backup Key with the Folsom Key", e3);
                throw new csha(76, csgx.NO_RETRY, e3);
            }
        } catch (GeneralSecurityException e4) {
            csjb e5 = c.e();
            e5.B("isUpdate", z);
            e5.y("folsomKeysSize", engwVar.size());
            e5.I("Failed to instantiate a GmsCryptor");
            e5.r();
            throw new csha(74, csgx.NO_RETRY, e4);
        }
    }

    private static eszz g(bqvj bqvjVar, String str, String str2, etao etaoVar) {
        eszy eszyVar = (eszy) eszz.a.createBuilder();
        eszyVar.a(str2);
        eszyVar.copyOnWrite();
        ((eszz) eszyVar.instance).k = str;
        eszg eszgVar = (eszg) eszh.a.createBuilder();
        eszgVar.copyOnWrite();
        ((eszh) eszgVar.instance).d = 5;
        eszyVar.copyOnWrite();
        eszz eszzVar = (eszz) eszyVar.instance;
        eszh eszhVar = (eszh) eszgVar.build();
        eszhVar.getClass();
        eszzVar.f = eszhVar;
        eszzVar.b |= 1;
        eszyVar.copyOnWrite();
        eszz eszzVar2 = (eszz) eszyVar.instance;
        etaoVar.getClass();
        eszzVar2.i = etaoVar;
        eszzVar2.b |= 4;
        eszyVar.copyOnWrite();
        ((eszz) eszyVar.instance).d = "root";
        eszyVar.copyOnWrite();
        ((eszz) eszyVar.instance).e = etad.a(4);
        if (csgj.a() && ((Boolean) ((cfup) csgj.s.get()).e()).booleanValue()) {
            if (bqvjVar.l() == 1) {
                eszyVar.a("encryption_key");
            } else if (bqvjVar.l() == 3) {
                eszyVar.a("hmac_sha256_key");
            }
        }
        return (eszz) eszyVar.build();
    }

    private static eszz h(bqvj bqvjVar, String str, etao etaoVar) {
        String o = bqvjVar.o();
        if (emxe.c(o)) {
            throw new csgz(String.format("Missing CMS Object ID for CmsTable key type %s, key index %d", Integer.valueOf(bqvjVar.l()), Integer.valueOf(bqvjVar.k())));
        }
        eszy eszyVar = (eszy) eszz.a.createBuilder();
        eszyVar.copyOnWrite();
        eszz eszzVar = (eszz) eszyVar.instance;
        o.getClass();
        eszzVar.c = o;
        eszyVar.a(str);
        eszyVar.copyOnWrite();
        eszz eszzVar2 = (eszz) eszyVar.instance;
        etaoVar.getClass();
        eszzVar2.i = etaoVar;
        eszzVar2.b |= 4;
        return (eszz) eszyVar.build();
    }

    private static etao i(esij esijVar) {
        etan etanVar = (etan) etao.a.createBuilder();
        etap etapVar = (etap) etaq.a.createBuilder();
        etapVar.copyOnWrite();
        ((etaq) etapVar.instance).f = "key_content@message.cms.google";
        eydp eydpVar = (eydp) eydq.a.createBuilder();
        eydpVar.copyOnWrite();
        ((eydq) eydpVar.instance).b = "type.googleapis.com/communication.messages.proto.cloud_store.encrypted_data.EncryptedData";
        eyee byteString = esijVar.toByteString();
        eydpVar.copyOnWrite();
        ((eydq) eydpVar.instance).c = byteString;
        eydq eydqVar = (eydq) eydpVar.build();
        etapVar.copyOnWrite();
        etaq etaqVar = (etaq) etapVar.instance;
        eydqVar.getClass();
        etaqVar.g = eydqVar;
        etaqVar.b |= 1;
        etaq etaqVar2 = (etaq) etapVar.build();
        etanVar.copyOnWrite();
        etao etaoVar = (etao) etanVar.instance;
        etaqVar2.getClass();
        etaoVar.a();
        etaoVar.b.add(0, etaqVar2);
        return (etao) etanVar.build();
    }

    private final etao j(bqvj bqvjVar, eshl eshlVar) {
        esii esiiVar = (esii) esij.a.createBuilder();
        eyee byteString = eshlVar.toByteString();
        if (bqvjVar.l() != 2) {
            bqvj c2 = ((cryg) this.a.b()).c(2);
            if (c2 == null) {
                throw new crvu("Failed to encrypt key, no key found");
            }
            try {
                l(byteString.I(), c2, esiiVar);
            } catch (Exception e) {
                b.o("Failed to encrypt key", e);
                throw new crvw("Failed to encrypt key", e);
            }
        } else {
            esiiVar.copyOnWrite();
            ((esij) esiiVar.instance).c = -1;
            esiiVar.copyOnWrite();
            ((esij) esiiVar.instance).b = byteString;
        }
        return i((esij) esiiVar.build());
    }

    @Override // defpackage.crvy
    public final eszz a(bqvj bqvjVar) {
        efbd.b();
        eshl e = e(bqvjVar);
        if (e == null) {
            return null;
        }
        String n = bqvjVar.n();
        String.format(Locale.US, "CorrelationId expected to be populated. key index = %d, key type = %d", Integer.valueOf(bqvjVar.k()), Integer.valueOf(bqvjVar.l()));
        n.getClass();
        return g(bqvjVar, n, bqvjVar.l() == 2 ? "backup_key" : "cipher", j(bqvjVar, e));
    }

    @Override // defpackage.crvy
    public final eszz b(bqvj bqvjVar, engw engwVar) {
        return f(bqvjVar, engwVar, false);
    }

    @Override // defpackage.crvy
    public final eszz c(bqvj bqvjVar) {
        efbd.b();
        emxf.a(bqvjVar.l() == 2);
        eshl e = e(bqvjVar);
        if (e == null) {
            throw new csha(75, csgx.NO_RETRY);
        }
        c.p("Building Backup Key for update...");
        return h(bqvjVar, "backup_key", j(bqvjVar, e));
    }

    @Override // defpackage.crvy
    public final eszz d(bqvj bqvjVar, engw engwVar) {
        return f(bqvjVar, engwVar, true);
    }
}
