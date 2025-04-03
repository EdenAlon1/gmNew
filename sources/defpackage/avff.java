package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avff {
    public static final cskc a = cskc.g("Bugle", "RbmBusinessInfoDataService");
    public final errl b;
    public final dtuu c;

    public avff(errl errlVar, dtuu dtuuVar) {
        this.b = errlVar;
        this.c = dtuuVar;
    }

    public static void b(BusinessInfoData businessInfoData, long j) {
        cskc cskcVar = a;
        cskcVar.p("Beginning RBM business info validation...");
        e(businessInfoData.getRbmBotId(), "rbmBotId");
        e(businessInfoData.getName(), "displayName");
        e(businessInfoData.getLogoImageRemoteUrl(), "logoImageRemoteUrl");
        e(businessInfoData.getLogoImageLocalUri(), "logoImageLocalUri");
        e(businessInfoData.getDescription(), "description");
        e(businessInfoData.getColor(), BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR);
        e(businessInfoData.getHeroImageRemoteUrl(), "heroImageRemoteUrl");
        e(businessInfoData.getHeroImageLocalUri(), "heroImageLocalUri");
        if (j >= 0) {
            cskcVar.p("Successfully completed RBM business info validation...");
            return;
        }
        csjb e = cskcVar.e();
        e.I("Invalid bot info. Negative expiryMilliseconds.");
        e.z("RBM bot info expiry milliseconds", j);
        e.r();
        throw new avhg("Invalid bot info. Negative expiryMilliseconds.", 5);
    }

    public static void c(BusinessInfoData businessInfoData) {
        cskc cskcVar = a;
        cskcVar.p("Beginning RBM business verifier info validation...");
        e(businessInfoData.getVerifierId(), "verifierId");
        e(businessInfoData.getVerifierName(), "verifierName");
        e(businessInfoData.getVerifierLogoImageRemoteUrl(), "verifierLogoImageRemoteUrl");
        e(businessInfoData.getVerifierLogoImageLocalUri(), "verifierLogoImageLocalUri");
        cskcVar.p("Successfully completed RBM business verifier info validation...");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Optional d(final String str) {
        Object apply;
        Object apply2;
        if (TextUtils.isEmpty(str)) {
            csjb e = a.e();
            e.I("Cannot retrieve business info from database; found empty bot id.");
            e.r();
            throw new avhg("Cannot retrieve business info from database; found empty bot id.", 2);
        }
        cskc cskcVar = a;
        csjb c = cskcVar.c();
        c.I("Attempting read of business info data...");
        c.A("RBM bot id", cskt.b(str));
        c.r();
        bopd a2 = bopg.a();
        a2.z("getBusinessInfoDataSync-rbm_business_info_and_verifier_info");
        apply = new Function() { // from class: aves
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bopf bopfVar = (bopf) obj;
                bopfVar.b(str);
                return bopfVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bopf());
        a2.k(new bope((bopf) apply));
        engw y = a2.b().y();
        if (y.isEmpty()) {
            cskcVar.p("Cannot create BusinessInfoData object from empty business info from database.");
            return Optional.empty();
        }
        bwqd a3 = bwqg.a();
        a3.z("getBusinessInfoDataSync-rbm_business_info_properties");
        apply2 = new Function() { // from class: avew
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwqf bwqfVar = (bwqf) obj;
                bwqfVar.b(str);
                return bwqfVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bwqf());
        a3.k(new bwqe((bwqf) apply2));
        engw y2 = a3.b().y();
        bont bontVar = (bont) y.get(0);
        String i = bontVar.i();
        enou enouVar = (enou) y2;
        int i2 = enouVar.c;
        int i3 = 0;
        while (i3 < i2) {
            bwox bwoxVar = (bwox) y2.get(i3);
            if (bwoxVar.m() == null) {
                csjb e2 = a.e();
                e2.I("Invalid bot info in database. Null property value.");
                e2.A("RBM bot id", cskt.b(i));
                e2.r();
                throw new avhg("Invalid bot info in database. Null property value.", 5);
            }
            i3++;
            if (bwoxVar.l() == null) {
                csjb e3 = a.e();
                e3.I("Invalid bot info in database. Null header.");
                e3.A("RBM bot id", cskt.b(i));
                e3.r();
                throw new avhg("Invalid bot info in database. Null header.", 5);
            }
        }
        BusinessInfoData.Builder builder = BusinessInfoData.builder(bontVar.i());
        builder.setName(bontVar.h());
        bontVar.az(2, "logo_image_remote_url");
        builder.setLogoImageRemoteUrl(bontVar.a);
        bontVar.az(3, "logo_image_local_uri");
        builder.setLogoImageLocalUri(bontVar.b);
        builder.setDescription(bontVar.g());
        bontVar.az(5, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR);
        builder.setColor(bontVar.c);
        bontVar.az(6, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_REMOTE_URL);
        builder.setHeroImageRemoteUrl(bontVar.d);
        bontVar.az(7, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_LOCAL_URI);
        String str2 = bontVar.e;
        str2.getClass();
        builder.setHeroImageLocalUri(str2);
        bontVar.az(11, "verifier_id");
        builder.setVerifierId(bontVar.h);
        builder.setVerifierName(bontVar.k());
        bontVar.az(13, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_REMOTE_URL);
        builder.setVerifierLogoImageRemoteUrl(bontVar.i);
        builder.setVerifierLogoImageLocalUri(bontVar.j());
        builder.setVerificationStatus(2);
        builder.setAgentUseCase(bontVar.f());
        int i4 = enouVar.c;
        for (int i5 = 0; i5 < i4; i5++) {
            bwox bwoxVar2 = (bwox) y2.get(i5);
            int legacyTypeFromPropertyType = BusinessInfoData.getLegacyTypeFromPropertyType(bwoxVar2.k());
            String m = bwoxVar2.m();
            m.getClass();
            String l = bwoxVar2.l();
            l.getClass();
            bwoxVar2.az(4, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.SUBHEADER);
            String str3 = bwoxVar2.e;
            axuf k = bwoxVar2.k();
            builder.addProperty(legacyTypeFromPropertyType, m, l, str3, ((k == axuf.PROPERTY_TYPE_PRIMARY_EMAIL || k == axuf.PROPERTY_TYPE_PRIMARY_PHONE_NUMBER || k == axuf.PROPERTY_TYPE_PRIMARY_WEBSITE || k == axuf.PROPERTY_TYPE_SMS_NUMBER || k == axuf.PROPERTY_TYPE_TERMS_AND_CONDITIONS_URL || k == axuf.PROPERTY_X_GOOGLE_SHORT_CODE) ? 1 : 0) ^ 1);
        }
        BusinessInfoData build = builder.build();
        bont bontVar2 = (bont) y.get(0);
        bontVar2.az(8, BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION);
        String str4 = bontVar2.f;
        bont bontVar3 = (bont) y.get(0);
        bontVar3.az(9, BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.EXPIRY_MILLISECONDS);
        long j = bontVar3.g;
        csjb c2 = a.c();
        c2.A("RBM bot id", cskt.b(str));
        c2.A("RBM bot info version", str4);
        c2.z("RBM bot info expiry milliseconds", j);
        c2.r();
        b(build, j);
        c(build);
        return Optional.of(build);
    }

    private static void e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            String a2 = a.a(str2, "Invalid bot info. Empty ", ".");
            a.r(a2);
            throw new avhg(a2, 5);
        }
    }

    public final elfl a(final String str) {
        return elfo.g(new Callable() { // from class: avfa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return avff.d(str);
            }
        }, this.b);
    }
}
