package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axmm {
    public final axkm a;
    public final aszq b;
    public final axcm c;
    private final Set d;

    public axmm(axkm axkmVar, aszq aszqVar, axcm axcmVar) {
        axkmVar.getClass();
        axcmVar.getClass();
        this.a = axkmVar;
        this.b = aszqVar;
        this.c = axcmVar;
        this.d = fffi.d(axmi.INITIAL_SYNC_STATUS_NOT_SET, axmi.STARTED, axmi.RESTORE_KEYS);
    }

    public static final eonp l(axeu axeuVar) {
        axeuVar.getClass();
        switch (axeuVar) {
            case UNSPECIFIED_STATUS:
            case ENABLE_FAILED:
            case DISABLED:
            case DISABLING:
            case DISABLE_FAILED:
                return eonp.NOT_ENABLED;
            case ENABLED:
                return eonp.ENABLED;
            case ENABLING:
                return eonp.IN_INITIAL_SYNC;
            default:
                throw new ffcd();
        }
    }

    public static final boolean m(axez axezVar) {
        axezVar.getClass();
        axmi b = axmi.b(axezVar.f);
        if (b == null) {
            b = axmi.INITIAL_SYNC_STATUS_NOT_SET;
        }
        b.getClass();
        return b == axmi.RESTORE || b == axmi.RESTORE_KEYS;
    }

    public static final boolean n(axez axezVar) {
        axmi b = axmi.b(axezVar.f);
        if (b == null) {
            b = axmi.INITIAL_SYNC_STATUS_NOT_SET;
        }
        return b == axmi.COMPLETE;
    }

    public static final boolean o(axez axezVar) {
        axezVar.getClass();
        axmi b = axmi.b(axezVar.f);
        if (b == null) {
            b = axmi.INITIAL_SYNC_STATUS_NOT_SET;
        }
        return b == axmi.RESTORE_MESSAGES_COMPLETE;
    }

    public final esye a(axez axezVar) {
        esye esyeVar;
        axezVar.getClass();
        if (this.b.a() && this.c.a()) {
            return esye.INITIAL_SYNC_STATE_UNSPECIFIED;
        }
        axmi b = axmi.b(axezVar.f);
        if (b == null) {
            b = axmi.INITIAL_SYNC_STATUS_NOT_SET;
        }
        switch (b) {
            case INITIAL_SYNC_STATUS_NOT_SET:
            case STARTED:
                esyeVar = esye.INITIAL_SYNC_STATE_UNSPECIFIED;
                break;
            case RESTORE:
            case RESTORE_KEYS:
                esyeVar = esye.RESTORE;
                break;
            case BACKUP:
            case RESTORE_MESSAGES_COMPLETE:
                esyeVar = esye.BACKUP;
                break;
            case FAILED:
            case INITIAL_BACKUP_NEEDS_RETRY:
                esyeVar = esye.FAILED;
                break;
            case COMPLETE:
                esyeVar = esye.COMPLETE;
                break;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(b))));
        }
        esyeVar.getClass();
        return esyeVar;
    }

    public final String b(axez axezVar) {
        axezVar.getClass();
        if (this.b.a() && this.c.a()) {
            return "STARTED";
        }
        axmi b = axmi.b(axezVar.f);
        if (b == null) {
            b = axmi.INITIAL_SYNC_STATUS_NOT_SET;
        }
        return b.name();
    }

    public final void c(boolean z) {
        this.a.ae(axmi.BACKUP, z);
    }

    public final void d() {
        this.a.ad(axmi.COMPLETE);
    }

    @ffbs
    public final void e() {
        f(true);
    }

    public final void f(boolean z) {
        this.a.ae(axmi.INITIAL_SYNC_STATUS_NOT_SET, z);
    }

    public final void g() {
        this.a.ad(axmi.FAILED);
    }

    public final void h() {
        this.a.ad(axmi.RESTORE_MESSAGES_COMPLETE);
    }

    public final void i() {
        this.a.ad(axmi.RESTORE_KEYS);
    }

    public final boolean j(axez axezVar) {
        if (this.b.a() && this.c.a()) {
            return true;
        }
        axmi b = axmi.b(axezVar.f);
        if (b == null) {
            b = axmi.INITIAL_SYNC_STATUS_NOT_SET;
        }
        return b != axmi.INITIAL_SYNC_STATUS_NOT_SET;
    }

    public final boolean k(axez axezVar) {
        axezVar.getClass();
        axmi b = axmi.b(axezVar.f);
        if (b == null) {
            b = axmi.INITIAL_SYNC_STATUS_NOT_SET;
        }
        return !this.d.contains(b);
    }
}
