package defpackage;

import android.net.Uri;
import android.os.PersistableBundle;
import android.telephony.gba.UaSecurityProtocolIdentifier;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class disn {
    public final disz a;
    public final disa b;
    private final dkvt c;
    private final errl d;

    public disn(dkvt dkvtVar, errl errlVar, disz diszVar, disa disaVar) {
        this.c = dkvtVar;
        this.d = errlVar;
        this.a = diszVar;
        this.b = disaVar;
    }

    public final ListenableFuture a(String str, boolean z) {
        PersistableBundle carrierConfig;
        Uri parse;
        SettableFuture create = SettableFuture.create();
        disk diskVar = new disk(this, create);
        carrierConfig = this.c.a.getCarrierConfig();
        int i = carrierConfig.getInt("gba_ua_security_organization_int");
        int i2 = carrierConfig.getInt("gba_ua_security_protocol_int");
        int i3 = carrierConfig.getInt("gba_ua_tls_cipher_suite_int");
        dkty.c("[SR] Creating the security protocol identifier: organization - %s, protocol - %s, cipher suite - %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        UaSecurityProtocolIdentifier build = new UaSecurityProtocolIdentifier.Builder().setOrg(i).setProtocol(i2).setTlsCipherSuite(i3).build();
        try {
            diyy diyyVar = ditn.a;
            String str2 = (String) dizg.o().a.r.a();
            if (TextUtils.isEmpty(str2)) {
                Uri parse2 = Uri.parse(str);
                parse = Uri.parse(String.format("%s://%s@%s", parse2.getScheme(), "3GPP-bootstrapping", parse2.getHost()));
            } else {
                parse = Uri.parse(str2);
                String userInfo = parse.getUserInfo();
                if (userInfo == null || !userInfo.equals("3GPP-bootstrapping")) {
                    throw new IllegalStateException(String.format("Wrong NAF ID %s. GBA mode is %s instead of %s.", parse, parse.getUserInfo(), "3GPP-bootstrapping"));
                }
                if (!TextUtils.isEmpty(parse.getPath())) {
                    throw new IllegalStateException(String.format("Wrong NAF ID %s. The path should be empty, but was %s.", parse, parse.getPath()));
                }
            }
            Uri uri = parse;
            dkty.c("[SR] Making a bootstrap authentication request to %s with forcedBootstrapping = %s", uri, Boolean.valueOf(z));
            try {
                try {
                    this.c.a.bootstrapAuthenticationRequest(5, uri, new dkva(build).a, z, this.d, new dkuz(diskVar).a);
                    return create;
                } catch (SecurityException e) {
                    throw new dkvd("PERFORM_IMS_SINGLE_REGISTRATION and MODIFY_PHONE_STATE permissions required", e);
                }
            } catch (dkvd e2) {
                disz diszVar = this.a;
                eyue eyueVar = (eyue) eyuj.a.createBuilder();
                eyueVar.copyOnWrite();
                eyuj eyujVar = (eyuj) eyueVar.instance;
                eyujVar.c = 1;
                eyujVar.b = 1 | eyujVar.b;
                eyueVar.copyOnWrite();
                eyuj eyujVar2 = (eyuj) eyueVar.instance;
                eyujVar2.d = 2;
                eyujVar2.b = 2 | eyujVar2.b;
                diszVar.a(4, (eyuj) eyueVar.build());
                create.setException(e2);
                return create;
            }
        } catch (IllegalStateException e3) {
            disz diszVar2 = this.a;
            eyue eyueVar2 = (eyue) eyuj.a.createBuilder();
            eyueVar2.copyOnWrite();
            eyuj eyujVar3 = (eyuj) eyueVar2.instance;
            eyujVar3.c = 1;
            eyujVar3.b = 1 | eyujVar3.b;
            eyueVar2.copyOnWrite();
            eyuj eyujVar4 = (eyuj) eyueVar2.instance;
            eyujVar4.d = 4;
            eyujVar4.b = 2 | eyujVar4.b;
            diszVar2.a(4, (eyuj) eyueVar2.build());
            create.setException(e3);
            return create;
        }
    }
}
