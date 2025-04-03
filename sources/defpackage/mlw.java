package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.os.Build;
import android.provider.Settings;
import android.util.SparseArray;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mlw {
    static final enhk b;
    private final SparseArray d = new SparseArray();
    private final int e;
    public static final mlw a = new mlw(engw.r(mlv.a));
    private static final engw c = engw.t(2, 5, 6);

    static {
        enhd enhdVar = new enhd();
        enhdVar.k(5, 6);
        enhdVar.k(17, 6);
        enhdVar.k(7, 6);
        enhdVar.k(30, 10);
        enhdVar.k(18, 6);
        enhdVar.k(6, 8);
        enhdVar.k(8, 8);
        enhdVar.k(14, 8);
        b = enhdVar.c();
    }

    public mlw(List list) {
        for (int i = 0; i < ((enou) list).c; i++) {
            mlv mlvVar = (mlv) list.get(i);
            this.d.put(mlvVar.b, mlvVar);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.d.size(); i3++) {
            i2 = Math.max(i2, ((mlv) this.d.valueAt(i3)).c);
        }
        this.e = i2;
    }

    static mlw b(Context context, lpk lpkVar, mmb mmbVar) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), lpkVar, mmbVar);
    }

    static mlw c(Context context, Intent intent, lpk lpkVar, mmb mmbVar) {
        boolean isDirectPlaybackSupported;
        List directProfilesForAttributes;
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        List audioDevicesForAttributes;
        Object systemService = context.getSystemService("audio");
        lti.f(systemService);
        AudioManager audioManager = (AudioManager) systemService;
        if (mmbVar == null) {
            mmb mmbVar2 = null;
            if (lvf.a >= 33) {
                try {
                    audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(lpkVar.a().a);
                    if (!audioDevicesForAttributes.isEmpty()) {
                        mmbVar2 = new mmb((AudioDeviceInfo) audioDevicesForAttributes.get(0));
                    }
                } catch (RuntimeException unused) {
                }
            }
            mmbVar = mmbVar2;
        }
        if (lvf.a >= 33 && (lvf.ab(context) || lvf.V(context))) {
            directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(lpkVar.a().a);
            HashMap hashMap = new HashMap();
            hashMap.put(2, new HashSet(ermn.j(12)));
            for (int i = 0; i < directProfilesForAttributes.size(); i++) {
                AudioProfile m = mll$$ExternalSyntheticApiModelOutline0.m(directProfilesForAttributes.get(i));
                encapsulationType = m.getEncapsulationType();
                if (encapsulationType != 1) {
                    format = m.getFormat();
                    if (lvf.X(format) || b.containsKey(Integer.valueOf(format))) {
                        Integer valueOf = Integer.valueOf(format);
                        if (hashMap.containsKey(valueOf)) {
                            Set set = (Set) hashMap.get(valueOf);
                            lti.f(set);
                            channelMasks2 = m.getChannelMasks();
                            set.addAll(ermn.j(channelMasks2));
                        } else {
                            channelMasks = m.getChannelMasks();
                            hashMap.put(valueOf, new HashSet(ermn.j(channelMasks)));
                        }
                    }
                }
            }
            int i2 = engw.d;
            engr engrVar = new engr();
            for (Map.Entry entry : hashMap.entrySet()) {
                engrVar.h(new mlv(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new mlw(engrVar.g());
        }
        AudioDeviceInfo[] devices = mmbVar == null ? audioManager.getDevices(2) : new AudioDeviceInfo[]{mmbVar.a};
        enin eninVar = new enin();
        eninVar.i(8, 7);
        if (lvf.a >= 31) {
            eninVar.i(26, 27);
        }
        if (lvf.a >= 33) {
            eninVar.c(30);
        }
        enip g = eninVar.g();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (g.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return a;
            }
        }
        enin eninVar2 = new enin();
        eninVar2.c(2);
        if (lvf.a >= 29 && (lvf.ab(context) || lvf.V(context))) {
            int i3 = engw.d;
            engr engrVar2 = new engr();
            enqu listIterator = b.keySet().listIterator();
            while (listIterator.hasNext()) {
                Integer num = (Integer) listIterator.next();
                int intValue = num.intValue();
                if (lvf.a >= lvf.g(intValue)) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), lpkVar.a().a);
                    if (isDirectPlaybackSupported) {
                        engrVar2.h(num);
                    }
                }
            }
            engrVar2.h(2);
            eninVar2.j(engrVar2.g());
            return new mlw(f(ermn.l(eninVar2.g()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z || d()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            eninVar2.j(c);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new mlw(f(ermn.l(eninVar2.g()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            eninVar2.j(ermn.j(intArrayExtra));
        }
        return new mlw(f(ermn.l(eninVar2.g()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    public static boolean d() {
        return Build.MANUFACTURER.equals("Amazon") || Build.MANUFACTURER.equals("Xiaomi");
    }

    private static engw f(int[] iArr, int i) {
        int i2 = engw.d;
        engr engrVar = new engr();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i3 : iArr) {
            engrVar.h(new mlv(i3, i));
        }
        return engrVar.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fe, code lost:
    
        if (r7 != 5) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x003e, code lost:
    
        if (e(30) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0129 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair a(defpackage.lqc r11, defpackage.lpk r12) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mlw.a(lqc, lpk):android.util.Pair");
    }

    public final boolean e(int i) {
        return lvf.T(this.d, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
    
        if (r1 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof defpackage.mlw
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            mlw r9 = (defpackage.mlw) r9
            android.util.SparseArray r1 = r8.d
            android.util.SparseArray r3 = r9.d
            int r4 = defpackage.lvf.a
            r5 = 31
            if (r4 < r5) goto L1d
            boolean r1 = defpackage.mll$$ExternalSyntheticApiModelOutline0.m(r1, r3)
            if (r1 == 0) goto L46
            goto L3f
        L1d:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 != r5) goto L46
            r5 = r2
        L28:
            if (r5 >= r4) goto L3f
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = j$.util.Objects.equals(r7, r6)
            if (r6 == 0) goto L46
            int r5 = r5 + 1
            goto L28
        L3f:
            int r1 = r8.e
            int r9 = r9.e
            if (r1 != r9) goto L46
            return r0
        L46:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mlw.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2 = lvf.a;
        SparseArray sparseArray = this.d;
        if (i2 >= 31) {
            i = sparseArray.contentHashCode();
        } else {
            int i3 = 17;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                i3 = (((i3 * 31) + sparseArray.keyAt(i4)) * 31) + Objects.hashCode(sparseArray.valueAt(i4));
            }
            i = i3;
        }
        return this.e + (i * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.e + ", audioProfiles=" + this.d.toString() + "]";
    }
}
