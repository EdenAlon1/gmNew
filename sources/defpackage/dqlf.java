package defpackage;

import com.google.android.apps.messaging.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqlf {
    public static final dqlf a;
    public static final dqlf b;
    public static final dqlf c;
    public static final dqlf d;
    public static final dqlf e;
    public static final dqlf f;
    public static final dqlf g;
    public static final dqlf h;
    public static final dqlf i;
    public static final dqlf j;
    private static final /* synthetic */ dqlf[] n;
    public final engw k;
    public final int l;
    public final engw m;

    static {
        engw r = engw.r("android.permission.CAMERA");
        r.getClass();
        dqlf dqlfVar = new dqlf("CAMERA", 0, r, R.string.access_camera_permission_name);
        a = dqlfVar;
        engw r2 = engw.r("android.permission.ACCESS_FINE_LOCATION");
        r2.getClass();
        dqlf dqlfVar2 = new dqlf("FINE_LOCATION", 1, r2, R.string.access_fine_location_permission_name);
        b = dqlfVar2;
        engw r3 = engw.r("android.permission.READ_EXTERNAL_STORAGE");
        r3.getClass();
        dqlf dqlfVar3 = new dqlf("READ_EXTERNAL_STORAGE", 2, r3, R.string.read_external_storage_permission_name);
        c = dqlfVar3;
        engw r4 = engw.r("android.permission.READ_MEDIA_AUDIO");
        r4.getClass();
        int i2 = R.string.read_media_images_permission_name;
        dqlf dqlfVar4 = new dqlf("READ_MEDIA_AUDIO", 3, r4, i2);
        d = dqlfVar4;
        engw s = engw.s("android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        s.getClass();
        dqlf dqlfVar5 = new dqlf("READ_MEDIA_IMAGES", 4, s, i2);
        e = dqlfVar5;
        engw s2 = engw.s("android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        s2.getClass();
        int i3 = R.string.read_media_videos_permission_name;
        dqlf dqlfVar6 = new dqlf("READ_MEDIA_VIDEOS", 5, s2, i3);
        f = dqlfVar6;
        engw r5 = engw.r("android.permission.RECORD_AUDIO");
        r5.getClass();
        dqlf dqlfVar7 = new dqlf("RECORD_AUDIO", 6, r5, R.string.record_audio_permission_name);
        g = dqlfVar7;
        engw r6 = engw.r("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        r6.getClass();
        engw s3 = engw.s("android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO");
        s3.getClass();
        dqlf dqlfVar8 = new dqlf("READ_MEDIA_VISUAL_USER_SELECTED", 7, r6, R.string.read_media_images_permission_name, s3);
        h = dqlfVar8;
        engw r7 = engw.r("android.permission.READ_MEDIA_IMAGES");
        r7.getClass();
        dqlf dqlfVar9 = new dqlf("FULL_READ_MEDIA_IMAGES", 8, r7, i2);
        i = dqlfVar9;
        engw r8 = engw.r("android.permission.READ_MEDIA_VIDEO");
        r8.getClass();
        dqlf dqlfVar10 = new dqlf("FULL_READ_MEDIA_VIDEOS", 9, r8, i3);
        j = dqlfVar10;
        dqlf[] dqlfVarArr = {dqlfVar, dqlfVar2, dqlfVar3, dqlfVar4, dqlfVar5, dqlfVar6, dqlfVar7, dqlfVar8, dqlfVar9, dqlfVar10};
        n = dqlfVarArr;
        ffhw.a(dqlfVarArr);
    }

    private dqlf(String str, int i2, engw engwVar, int i3, engw engwVar2) {
        this.k = engwVar;
        this.l = i3;
        this.m = engwVar2;
    }

    public static dqlf[] values() {
        return (dqlf[]) n.clone();
    }

    public /* synthetic */ dqlf(String str, int i2, engw engwVar, int i3) {
        this(str, i2, engwVar, i3, enou.a);
    }
}
