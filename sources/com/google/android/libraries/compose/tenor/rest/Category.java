package com.google.android.libraries.compose.tenor.rest;

import defpackage.ffkj;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class Category {
    private final String image;
    private final String name;
    private final String searchterm;

    public Category(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.name = str;
        this.searchterm = str2;
        this.image = str3;
    }

    public static /* synthetic */ Category copy$default(Category category, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = category.name;
        }
        if ((i & 2) != 0) {
            str2 = category.searchterm;
        }
        if ((i & 4) != 0) {
            str3 = category.image;
        }
        return category.copy(str, str2, str3);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.searchterm;
    }

    public final String component3() {
        return this.image;
    }

    public final Category copy(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new Category(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Category)) {
            return false;
        }
        Category category = (Category) obj;
        return ffkj.e(this.name, category.name) && ffkj.e(this.searchterm, category.searchterm) && ffkj.e(this.image, category.image);
    }

    public final String getImage() {
        return this.image;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSearchterm() {
        return this.searchterm;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.searchterm.hashCode()) * 31) + this.image.hashCode();
    }

    public String toString() {
        return "Category(name=" + this.name + ", searchterm=" + this.searchterm + ", image=" + this.image + ")";
    }
}
