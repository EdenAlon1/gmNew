package defpackage;

import com.google.android.apps.messaging.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnqt {
    public static final cnqt a;
    public static final cnqt b;
    public static final cnqt c;
    public static final cnqt d;
    public static final cnqt e;
    private static final /* synthetic */ cnqt[] h;
    public final int f;
    public final int g;

    static {
        cnqt cnqtVar = new cnqt("TOMBSTONE_SUCCESS_HELP_STILL_NEEDED", 0, 246, R.string.end_of_emergency_tombstone_success_text);
        a = cnqtVar;
        cnqt cnqtVar2 = new cnqt("TOMBSTONE_SUCCESS_HELP_NO_LONGER_NEEDED", 1, 247, R.string.end_of_emergency_tombstone_success_text);
        b = cnqtVar2;
        cnqt cnqtVar3 = new cnqt("TOMBSTONE_FAILURE_HELP_STILL_NEEDED", 2, 248, R.string.end_of_emergency_tombstone_failure_text);
        c = cnqtVar3;
        cnqt cnqtVar4 = new cnqt("TOMBSTONE_FAILURE_HELP_NO_LONGER_NEEDED", 3, 249, R.string.end_of_emergency_tombstone_failure_text);
        d = cnqtVar4;
        cnqt cnqtVar5 = new cnqt("TOMBSTONE_UNEXPECTED_END", 4, 250, R.string.end_of_emergency_tombstone_unexpected_text);
        e = cnqtVar5;
        cnqt[] cnqtVarArr = {cnqtVar, cnqtVar2, cnqtVar3, cnqtVar4, cnqtVar5};
        h = cnqtVarArr;
        ffhw.a(cnqtVarArr);
    }

    private cnqt(String str, int i, int i2, int i3) {
        this.f = i2;
        this.g = i3;
    }

    public static cnqt[] values() {
        return (cnqt[]) h.clone();
    }
}
