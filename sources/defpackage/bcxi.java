package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcxi extends bcyw {
    public final Uri a;
    public final String b;
    private final String d;
    private final long e;
    private final String f;
    private final long g;
    private final aoku h;
    private final boolean i;
    private final Optional j = Optional.empty();

    public bcxi(azze azzeVar, aolr aolrVar, ParticipantsTable.BindData bindData) {
        ProfilesTable.BindData bindData2;
        this.a = azzeVar.a(bindData);
        this.e = bindData.u();
        this.f = bindData.T();
        this.g = bindData.v();
        aoku q = aolrVar.q(bindData);
        this.h = q;
        boolean d = bdqv.d(bindData);
        this.i = d;
        bindData.D();
        if (!TextUtils.isEmpty(bindData.R())) {
            this.b = bindData.R();
            this.d = bdqu.n(bindData) ? null : bindData.W();
            return;
        }
        String a = (!bindData.aE("profiles_table_join_tag") || (bindData2 = (ProfilesTable.BindData) bindData.aw("profiles_table_join_tag", ProfilesTable.BindData.class)) == null || TextUtils.isEmpty(bindData2.v())) ? null : cjze.a(bindData2.v());
        if (a != null) {
            this.d = a;
        } else {
            this.d = null;
        }
        this.b = d ? q.G().a : bdqu.k(bindData);
    }

    @Override // defpackage.bcyw
    public final long a() {
        return this.e;
    }

    @Override // defpackage.bcyw
    public final long b() {
        return this.g;
    }

    @Override // defpackage.bcyw
    public final Intent c() {
        return null;
    }

    @Override // defpackage.bcyw
    public final Uri d() {
        return this.a;
    }

    @Override // defpackage.bcyw
    public final Optional e() {
        return Optional.of(this.h);
    }

    @Override // defpackage.bcyw
    public final Optional k() {
        return this.j;
    }

    @Override // defpackage.bcyw
    public final String l() {
        return this.d;
    }

    @Override // defpackage.bcyw
    public final String m() {
        return this.b;
    }

    @Override // defpackage.bcyw
    public final String n() {
        return this.f;
    }
}
