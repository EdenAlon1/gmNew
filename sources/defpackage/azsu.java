package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azsu extends crmf<azop, UUID> implements Comparable<azsu> {
    public azsu(UUID uuid) {
        super(uuid);
    }

    public static azsu a(String str) {
        return new azsu(UUID.fromString(str));
    }

    public final String b() {
        return ((UUID) this.b).toString();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(azsu azsuVar) {
        return ((UUID) this.b).compareTo((UUID) azsuVar.b);
    }
}
