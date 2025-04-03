package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.unu;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uon {
    public static final dsat a(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        context.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        boolean a = ((aurs) ffbrVar3.b()).a();
        Integer valueOf = Integer.valueOf(R.drawable.shortcuts_screen_background);
        if (a) {
            uof uofVar = (uof) ffbrVar4.b();
            Integer num = uofVar.b() ? valueOf : null;
            fffs fffsVar = new fffs((byte[]) null);
            fffsVar.add(new dsar(R.string.camera_gallery_shortcut_title, new dsaq(R.drawable.ic_compose_camera_gallery_unselected_v2, new dsap(uofVar.a(R.color.camera_gallery_shortcut_background), new dszo(R.color.camera_gallery_shortcut_icon_tint))), null, new ffji() { // from class: unx
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    View view = (View) obj;
                    if (view == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    ellj.g(new unu.a(view), view);
                    return ffcu.a;
                }
            }, 12));
            if (((Boolean) uky.c.e()).booleanValue()) {
                if (uky.c()) {
                    fffsVar.add(new dsar(R.string.gifs_shortcut_title, new dsaq(R.drawable.gifs_shortcut_icon, new dsap(uofVar.a(R.color.gifs_shortcut_background), new dszo(R.color.gifs_shortcut_icon_tint))), null, new ffji() { // from class: uny
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            View view = (View) obj;
                            if (view == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            ellj.g(new unu.d(view, dszr.c), view);
                            return ffcu.a;
                        }
                    }, 12));
                }
                if (uky.d()) {
                    fffsVar.add(new dsar(R.string.stickers_shortcut_title, new dsaq(R.drawable.quantum_gm_ic_sticker_vd_theme_24, new dsap(uofVar.a(R.color.stickers_shortcut_background), new dszo(R.color.stickers_shortcut_icon_tint))), null, new ffji() { // from class: unz
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            View view = (View) obj;
                            if (view == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            ellj.g(new unu.d(view, dszr.f), view);
                            return ffcu.a;
                        }
                    }, 12));
                }
            }
            fffsVar.add(new dsar(R.string.files_shortcut_title, new dsaq(R.drawable.quantum_gm_ic_attach_file_vd_theme_24, new dsap(uofVar.a(R.color.files_shortcut_background), new dszo(R.color.files_shortcut_icon_tint))), null, new ffji() { // from class: uoa
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    View view = (View) obj;
                    if (view == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    ellj.g(new unu.c(view), view);
                    return ffcu.a;
                }
            }, 12));
            if (uofVar.b.isPresent()) {
                fffsVar.add(new dsar(R.string.location_shortcut_title, new dsaq(R.drawable.quantum_gm_ic_place_vd_theme_24, new dsap(uofVar.a(R.color.location_shortcut_background), new dszo(R.color.location_shortcut_icon_tint))), ffdx.b(dqlf.b), new ffji() { // from class: uob
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        View view = (View) obj;
                        if (view == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        ellj.g(new unu.e(view), view);
                        return ffcu.a;
                    }
                }, 4));
            }
            fffsVar.add(new dsar(R.string.contacts_shortcut_title, new dsaq(R.drawable.quantum_gm_ic_person_vd_theme_24, new dsap(uofVar.a(R.color.contacts_shortcut_background), new dszo(R.color.contacts_shortcut_icon_tint))), null, new ffji() { // from class: uoc
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    View view = (View) obj;
                    if (view == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    ellj.g(new unu.b(view), view);
                    return ffcu.a;
                }
            }, 12));
            if (((Boolean) cnvu.a.e()).booleanValue()) {
                fffsVar.add(new dsar(R.string.scheduled_send_shortcut_title, new dsaq(R.drawable.quantum_gm_ic_schedule_vd_theme_24, new dsap(uofVar.a(R.color.scheduled_send_shortcut_background), new dszo(R.color.scheduled_send_shortcut_icon_tint))), null, new ffji() { // from class: uod
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        View view = (View) obj;
                        if (view == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        ellj.g(new unu.f(view), view);
                        return ffcu.a;
                    }
                }, 12));
            }
            return new dsat(ffdx.a(fffsVar), num);
        }
        Object b = ffbrVar.b();
        b.getClass();
        Integer num2 = ((Map) b).containsKey(cwmn.b) ? valueOf : null;
        fffs fffsVar2 = new fffs((byte[]) null);
        Object b2 = ffbrVar.b();
        b2.getClass();
        fffsVar2.add(new dsar(R.string.camera_gallery_shortcut_title, new dsaq(R.drawable.ic_compose_camera_gallery_unselected_v2, new dsap(b((Map) b2, R.color.camera_gallery_shortcut_background), new dszo(R.color.camera_gallery_shortcut_icon_tint))), null, new ffji() { // from class: uog
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                View view = (View) obj;
                if (view == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ellj.g(new unu.a(view), view);
                return ffcu.a;
            }
        }, 12));
        if (((Boolean) uky.c.e()).booleanValue()) {
            if (uky.c()) {
                Object b3 = ffbrVar.b();
                b3.getClass();
                fffsVar2.add(new dsar(R.string.gifs_shortcut_title, new dsaq(R.drawable.gifs_shortcut_icon, new dsap(b((Map) b3, R.color.gifs_shortcut_background), new dszo(R.color.gifs_shortcut_icon_tint))), null, new ffji() { // from class: uoh
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        View view = (View) obj;
                        if (view == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        ellj.g(new unu.d(view, dszr.c), view);
                        return ffcu.a;
                    }
                }, 12));
            }
            if (uky.d()) {
                Object b4 = ffbrVar.b();
                b4.getClass();
                fffsVar2.add(new dsar(R.string.stickers_shortcut_title, new dsaq(R.drawable.quantum_gm_ic_sticker_vd_theme_24, new dsap(b((Map) b4, R.color.stickers_shortcut_background), new dszo(R.color.stickers_shortcut_icon_tint))), null, new ffji() { // from class: uoi
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        View view = (View) obj;
                        if (view == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        ellj.g(new unu.d(view, dszr.f), view);
                        return ffcu.a;
                    }
                }, 12));
            }
        }
        Object b5 = ffbrVar.b();
        b5.getClass();
        fffsVar2.add(new dsar(R.string.files_shortcut_title, new dsaq(R.drawable.quantum_gm_ic_attach_file_vd_theme_24, new dsap(b((Map) b5, R.color.files_shortcut_background), new dszo(R.color.files_shortcut_icon_tint))), null, new ffji() { // from class: uoj
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                View view = (View) obj;
                if (view == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ellj.g(new unu.c(view), view);
                return ffcu.a;
            }
        }, 12));
        if (((Optional) ffbrVar2.b()).isPresent()) {
            Object b6 = ffbrVar.b();
            b6.getClass();
            fffsVar2.add(new dsar(R.string.location_shortcut_title, new dsaq(R.drawable.quantum_gm_ic_place_vd_theme_24, new dsap(b((Map) b6, R.color.location_shortcut_background), new dszo(R.color.location_shortcut_icon_tint))), ffdx.b(dqlf.b), new ffji() { // from class: uok
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    View view = (View) obj;
                    if (view == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    ellj.g(new unu.e(view), view);
                    return ffcu.a;
                }
            }, 4));
        }
        Object b7 = ffbrVar.b();
        b7.getClass();
        fffsVar2.add(new dsar(R.string.contacts_shortcut_title, new dsaq(R.drawable.quantum_gm_ic_person_vd_theme_24, new dsap(b((Map) b7, R.color.contacts_shortcut_background), new dszo(R.color.contacts_shortcut_icon_tint))), null, new ffji() { // from class: uol
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                View view = (View) obj;
                if (view == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ellj.g(new unu.b(view), view);
                return ffcu.a;
            }
        }, 12));
        if (((Boolean) cnvu.a.e()).booleanValue()) {
            Object b8 = ffbrVar.b();
            b8.getClass();
            fffsVar2.add(new dsar(R.string.scheduled_send_shortcut_title, new dsaq(R.drawable.quantum_gm_ic_schedule_vd_theme_24, new dsap(b((Map) b8, R.color.scheduled_send_shortcut_background), new dszo(R.color.scheduled_send_shortcut_icon_tint))), null, new ffji() { // from class: uom
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    View view = (View) obj;
                    if (view == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    ellj.g(new unu.f(view), view);
                    return ffcu.a;
                }
            }, 12));
        }
        return new dsat(ffdx.a(fffsVar2), num2);
    }

    private static final dszq b(Map map, int i) {
        return map.containsKey(cwmn.b) ? new dszn() : new dszo(i);
    }
}
