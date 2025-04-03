package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctyg {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/places/PlacesMessagingClient");
    public final List b = Arrays.asList(edpz.ID, edpz.TYPES, edpz.FORMATTED_ADDRESS, edpz.DISPLAY_NAME, edpz.LOCATION);
    public final errl c;
    public final ffbr d;

    public ctyg(errl errlVar, ffbr ffbrVar) {
        this.c = errlVar;
        this.d = ffbrVar;
    }

    public final elfl a(String str) {
        return elfl.g(duin.a(((edsg) this.d.b()).b(edrs.f(str, this.b).c()))).i(new eroh() { // from class: ctxx
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return elfo.e(Optional.ofNullable(((edrt) obj).a()));
            }
        }, this.c).e(Throwable.class, new emwl() { // from class: ctxy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((enrr) ((enrr) ((enrr) ctyg.a.j()).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/util/places/PlacesMessagingClient", "getPlace", 93, "PlacesMessagingClient.java")).q("Failed to get place from fetch place request.");
                return Optional.empty();
            }
        }, this.c);
    }
}
