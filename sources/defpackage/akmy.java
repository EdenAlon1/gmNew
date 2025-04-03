package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.android.apps.messaging.R;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akmy implements crjf {
    static final int[] a = {R.drawable.ic_contact_list_preset_1, R.drawable.ic_contact_list_preset_2, R.drawable.ic_contact_list_preset_3, R.drawable.ic_contact_list_preset_4, R.drawable.ic_contact_list_preset_5, R.drawable.ic_contact_list_preset_6, R.drawable.ic_contact_list_preset_7, R.drawable.ic_contact_list_preset_8, R.drawable.ic_contact_list_preset_9, R.drawable.ic_contact_list_preset_10, R.drawable.ic_contact_list_preset_11, R.drawable.ic_contact_list_preset_12, R.drawable.ic_contact_list_preset_13, R.drawable.ic_contact_list_preset_14, R.drawable.ic_contact_list_preset_15, R.drawable.ic_contact_list_preset_16, R.drawable.ic_contact_list_preset_17, R.drawable.ic_contact_list_preset_18, R.drawable.ic_contact_list_preset_19, R.drawable.ic_contact_list_preset_20, R.drawable.ic_contact_list_preset_21, R.drawable.ic_contact_list_preset_22, R.drawable.ic_contact_list_preset_23, R.drawable.ic_contact_list_preset_24, R.drawable.ic_contact_list_preset_25, R.drawable.ic_contact_list_preset_26, R.drawable.ic_contact_list_preset_27, R.drawable.ic_contact_list_preset_28, R.drawable.ic_contact_list_preset_29, R.drawable.ic_contact_list_preset_30, R.drawable.ic_contact_list_preset_31, R.drawable.ic_contact_list_preset_32, R.drawable.ic_contact_list_preset_33, R.drawable.ic_contact_list_preset_34, R.drawable.ic_contact_list_preset_35};
    private static final entd b = entd.c("Bugle");
    private final Context c;
    private final ffbr d;

    public akmy(Context context, ffbr ffbrVar) {
        this.c = context;
        this.d = ffbrVar;
    }

    @Override // defpackage.crjf
    public final Drawable a(String str) {
        int i = a[Math.abs(str.hashCode() % 35)];
        try {
            Resources resources = this.c.getResources();
            Resources.Theme theme = this.c.getTheme();
            WeakHashMap weakHashMap = kpp.a;
            return resources.getDrawable(i, theme);
        } catch (Resources.NotFoundException e) {
            ((ensz) ((ensz) ((ensz) b.j()).g(e)).h("com/google/android/apps/messaging/samsung/avatar/AvatarProviderImpl", "getAvatarBackgroundByIdentifier", 'K', "AvatarProviderImpl.java")).q("Avatar background resource not found");
            return null;
        }
    }

    @Override // defpackage.crjf
    public final Drawable b() {
        try {
            Resources resources = this.c.getResources();
            Resources.Theme theme = this.c.getTheme();
            WeakHashMap weakHashMap = kpp.a;
            return resources.getDrawable(R.drawable.ic_avatar_icon_oneui4, theme);
        } catch (Resources.NotFoundException e) {
            ((ensz) ((ensz) ((ensz) b.j()).g(e)).h("com/google/android/apps/messaging/samsung/avatar/AvatarProviderImpl", "getAvatarIcon", 'e', "AvatarProviderImpl.java")).q("Avatar icon resource not found");
            return null;
        }
    }

    @Override // defpackage.crjf
    public final Drawable c() {
        try {
            Resources resources = this.c.getResources();
            int i = true != ((crjx) this.d.b()).g() ? R.drawable.ic_contact_list_preset_unknown : R.drawable.ic_contact_list_preset_unknown_dark;
            Resources.Theme theme = this.c.getTheme();
            WeakHashMap weakHashMap = kpp.a;
            return resources.getDrawable(i, theme);
        } catch (Resources.NotFoundException e) {
            ((ensz) ((ensz) ((ensz) b.j()).g(e)).h("com/google/android/apps/messaging/samsung/avatar/AvatarProviderImpl", "getUnknownAvatarBackgroundByIdentifier", 'Z', "AvatarProviderImpl.java")).q("Avatar background resource not found");
            return null;
        }
    }
}
