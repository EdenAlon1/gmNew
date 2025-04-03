package com.google.android.rcs.client.profile;

import android.content.Context;
import com.google.android.ims.rcsservice.profile.IRcsProfile;
import defpackage.cfvl;
import defpackage.cuaf;
import defpackage.diyv;
import defpackage.diyy;
import defpackage.dizg;
import defpackage.djtp;
import defpackage.ehxc;
import defpackage.ehxi;
import defpackage.ekzz;
import defpackage.eleg;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class RcsProfileService extends ehxc<IRcsProfile> {
    public static final diyy h;
    private final cuaf i;

    static {
        cfvl.r(185392834, "convert_null_msisdn_to_empty_string");
        h = diyv.b("rcs_profile_service_connection_deprecated");
    }

    public RcsProfileService(Context context, ehxi ehxiVar, cuaf cuafVar) {
        super(IRcsProfile.class, context, ehxiVar, 1, Optional.empty());
        this.i = cuafVar;
    }

    @Override // defpackage.ehxc
    protected final boolean f() {
        return ((Boolean) h.a()).booleanValue();
    }

    public int getDefaultSharingMethod() {
        return this.i.a();
    }

    @Deprecated
    public int getGroupChatMaximumMessageSize() {
        return this.i.b();
    }

    @Deprecated
    public int getMaxGroupSize() {
        return this.i.c();
    }

    public String getMsisdn() {
        ekzz f = eleg.f("RcsProfileService::getMsisdn");
        try {
            String f2 = this.i.f();
            f.close();
            return f2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Deprecated
    public int getOne2OneChatMaximumMessageSize() {
        return this.i.d();
    }

    public djtp getRcsConfig() {
        return (djtp) this.i.e().orElse(null);
    }

    public String getRcsConfigAcsUrl() {
        return this.i.g();
    }

    @Override // defpackage.ehxc
    public String getRcsServiceMetaDataKey() {
        return "ProfileServiceVersions";
    }

    @Override // defpackage.ehxc
    public boolean isConnected() {
        if (((Boolean) dizg.o().a.aA.a()).booleanValue()) {
            return true;
        }
        return super.isConnected();
    }
}
